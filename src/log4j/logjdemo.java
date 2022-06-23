package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class logjdemo {
  @Test
  public void f() {
	  
	    // Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case logjdemo is classname
	         Logger logger=Logger.getLogger("logjdemo");
	        
	 
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
	 
	 
	        // Open browser
	        WebDriver driver = new FirefoxDriver();
	        logger.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	        
//	      we have methods like info,warn,debug.....
	 
	        // Load application
	        driver.get("https://www.google.co.in/");
	        logger.info("Url opened");
	      
	 
	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type"); 
	        
	        driver.close();
	        logger.info("browser closed.... ");
	  
  }
}
