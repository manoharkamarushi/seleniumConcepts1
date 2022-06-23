package PageFactory_LEARN_AUTOMATION;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCases {
  
@Test
public void verfiy_Login_WordPress() {
	
	Logger logger=Logger.getLogger("verfiy_Login_WordPress");
	PropertyConfigurator.configure("Log4j.properties");  
	
// This will launch browser,specific URL	  
WebDriver driver=Helper.BrowserFacory("firefox","http://demosite.center/wordpress/wp-login.php");

//PageFactory Instantiates all the elements of the web page 
//at the start when we Initialized any page class objects.	  

Login_Page obj=PageFactory.initElements(driver, Login_Page.class);
logger.info("object created");

//
obj.login_wordPress("admin", "demo123");
//Reporter.log("object called");	 
logger.info("object called");
 }

}
