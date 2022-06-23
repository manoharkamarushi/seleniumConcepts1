package pageFactory_ExecuteAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class GoogleSelTest {
		
	WebDriver driver;

 @Test
  public void f() throws InterruptedException {
	 
	  driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  GoogleSearch obj=PageFactory.initElements(driver, GoogleSearch.class);
	  			   obj.gsearch("selenium");
//	  we can enable the connection/link b.w two classes by declaring method of type class as shown
// seldown method returns the selniumpage object-page
	  			   
	  SeleniumPage page=obj.seldown();	  			   	
//	               page.task();
	               
	  				
  }
 
 }
