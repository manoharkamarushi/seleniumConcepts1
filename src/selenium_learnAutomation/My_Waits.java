package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class My_Waits {
	WebDriver driver;
  @Test
  public void f() {
 driver.findElement(By.xpath("//table[@class='tblTrip']//following::input[@value='OneWay']")).click();
  List<WebElement> table=driver.findElements(By.xpath(""));	
  
	
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  ProfilesIni init=new ProfilesIni();
	    
	  FirefoxProfile fp=init.getProfile("defualt");
	  driver=new FirefoxDriver(fp);
//	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
 driver.close();
  }

}
