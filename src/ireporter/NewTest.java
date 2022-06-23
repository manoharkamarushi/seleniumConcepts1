package ireporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  Reporter.log("driver created", true);
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Reporter.log("implicit wait given....", true);
	  
	  driver.get("http://google.co.in");
	  Reporter.log("application launched", true);
	  
	 driver.findElement(By.name("q")).sendKeys("Selenium");
	  Reporter.log("keyword typed", true);
	  
	  driver.close();
	  Reporter.log("browser closed", true);
  }
}
