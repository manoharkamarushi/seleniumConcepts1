package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FileUpload_AutoIT {
  WebDriver driver;
	@Test(invocationCount=2)
  public void f() throws Exception {
		
		driver.findElement(By.id("wordresume")).click();
		Thread.sleep(3000);
		
//	we can execute exe file from java program,so we use java class 
		
		  Runtime.getRuntime().exec("D:\\TESTING\\Testdata\\fileuplaod.exe");		
		 /* ControlFocus("File Upload","","Edit1")
		  ControlSetText("File Upload","","Edit1","C:\Users\manu\Desktop\sel.docx")
		  ControlClick("File Upload","","Button1","")*/
		  
//		save as fileupload.au3
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	 driver=new FirefoxDriver();
	  driver.get("http://my.monsterindia.com/create_account.html");
	  driver.manage().window().maximize();
	  

	  
  }
  @AfterTest
  public void afterTest() {
	  
  }

}
