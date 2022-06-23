package Screenshot_failed;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Screenshot_Test {
	
	WebDriver driver;
  @Test
  public void fails() {
	  
	  driver.getTitle();
	  Assert.assertTrue(driver.getTitle().contains("QTP"));
	  
	  
  }
  @AfterMethod
  public void afterMethod(ITestResult tr) {
	  System.out.println(tr.getStatus()); //1 -if pass  ,2-if fails
	  
	 if(ITestResult.FAILURE==tr.getStatus()){
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+tr.getName()+".png"));
			System.out.println("screenshot captured");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
  }

  @BeforeTest
  public void beforeTest() {
 driver=new FirefoxDriver();
 driver.get("http://learn-automation.com");
 driver.manage().window().maximize();
  }

}
