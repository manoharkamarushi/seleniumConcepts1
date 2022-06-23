package PageFactory_LEARN_AUTOMATION;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class Helper {

	static WebDriver driver;
public  static WebDriver BrowserFacory(String bname,String url){
	
	Logger logger=Logger.getLogger("Helper");
	PropertyConfigurator.configure("Log4j.properties");  
	
	if(bname.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
		logger.warn("browser launched");	
//		Reporter.log("firefox browser launched");
				
	}else if(bname.equalsIgnoreCase("chrome")){
		System.setProperty("WebDriver.chrome.driver", "");
		driver=new ChromeDriver();
//		Reporter.log("chrome browser launched");
		
	}else if(bname.equalsIgnoreCase("ie")){
		System.setProperty("WebDriver.ie.driver", "");
		driver=new InternetExplorerDriver();
//		Reporter.log("Ie launched");
	}

	url="http://demosite.center/wordpress/wp-login.php";
	
	driver.manage().window().maximize();
	driver.get(url);
	
//	Reporter.log("AUT opened");
	
	return driver;
	
	
}	
	
	
}
