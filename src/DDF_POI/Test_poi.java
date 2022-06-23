package DDF_POI;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Test_poi {
	WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void login(String n, String p) throws InterruptedException {
		
//		  boolean ans=driver.findElement(By.cssSelector("input#user_login")).isDisplayed();
//		  System.out.println(ans);
		  driver.findElement(By.cssSelector("input#user_login")).sendKeys(n);
		  driver.findElement(By.cssSelector("input#user_pass")).sendKeys(p);
		  driver.findElement(By.cssSelector("input#wp-submit")).click();
		  
		  boolean status=driver.getTitle().contains("Dashboard");
		  Assert.assertTrue(status,"Invalid credentials");
		  
//		  System.out.println("");
		  if(status){
			  System.out.println("user logged successfully for following credentials::"+n+" "+p);
			  driver.navigate().back();
			  Thread.sleep(4000);
		  }
		  
		  
	  }
	@BeforeTest
	public void init(){
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demosite.center/wordpress/wp-login.php");

	}
 
	
	
  
}
