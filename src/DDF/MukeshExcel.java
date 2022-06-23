package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MukeshExcel {
  
  static WebDriver driver;
  FileInputStream fin;
  File f;
  Workbook wb;
  Sheet sh;
      
  @Test(dataProvider="dp1")
  public void login(String n, String p) throws InterruptedException {
		
	  Reporter.log("---login method----");
	  driver.findElement(By.cssSelector("input#user_login")).sendKeys(n);
	  driver.findElement(By.cssSelector("input#user_pass")).sendKeys(p);
	  driver.findElement(By.cssSelector("input#wp-submit")).click();
	  
	  boolean status=driver.getTitle().contains("Dashboard");
	  Assert.assertTrue(status,"Invalid credentials");
	  
	  if(status){
		  System.out.println("user logged successfully for following credentials::username"+n+"password:"+p);
		  driver.navigate().back();
		  Thread.sleep(4000);
	  }
	  
	  
  }
  
  @DataProvider(name="dp1")
  public Object[][] read() throws BiffException, IOException{
	  
	  return Excel.readdata1();
	 }
 
  
  @BeforeTest
  public void init(){
  	
  driver=new FirefoxDriver();
  Reporter.log("firefox instance created");
  driver.manage().window().maximize();
  Reporter.log("window maximised");
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  driver.get("http://demosite.center/wordpress/wp-login.php");
  Reporter.log("link opened");

  }
  
  @AfterTest
  public void teardown(){
	Reporter.log("driver quits");
  	driver.quit();
  }
  
  
  

}
