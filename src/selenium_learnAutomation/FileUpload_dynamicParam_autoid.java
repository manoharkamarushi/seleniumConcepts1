package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FileUpload_dynamicParam_autoid {
WebDriver driver;
	@Test
  public void f() throws InterruptedException, IOException {
		
		driver.findElement(By.id("filed")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\TESTING\\Testdata\\fileUpload_dynamicParam.exe"+" "+"hotmail1.properties");
	
	
	
	}
  	@BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("file:///D:/TESTING/Testdata/upload.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
