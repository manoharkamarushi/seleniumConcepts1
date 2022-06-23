package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FIleUpload_Multiple_autoit {
	 WebDriver driver;
	 
	@Test
  public void f() throws IOException, InterruptedException {
		driver.findElement(By.id("filed")).click();
		Thread.sleep(5000);
Runtime.getRuntime().exec("D:\\TESTING\\Testdata\\mul_fileUpload.exe"+" "+"D:\\TESTING\\Testdata\\hotmail1.properties");
		Thread.sleep(3000);
		driver.findElement(By.id("filed")).click();
		Thread.sleep(3000);
Runtime.getRuntime().exec("D:\\TESTING\\Testdata\\mul_fileUpload.exe"+" "+"D:\\TESTING\\Testdata\\write.txt");
	
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
