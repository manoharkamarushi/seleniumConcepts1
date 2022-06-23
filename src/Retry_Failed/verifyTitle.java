package Retry_Failed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifyTitle {

	WebDriver driver;
	
  @BeforeTest
  public void init() {
	  
	  driver=new FirefoxDriver();
	  System.out.println("driver instance created");
	  driver.manage().window().maximize();
	   
  					 }
  
  @Test(retryAnalyzer=Retry.class)
  public void Homepage() throws InterruptedException{
	  
	  driver.get("http://learn-automation.com");
	  Thread.sleep(2000);
	  String actual=driver.getTitle().trim();
	  System.out.println(actual);
	  Assert.assertTrue(actual.contains("QTP"));
  						}
  
  @AfterTest
  public void teardown(){
	  
//	  driver.close();
  }
}
