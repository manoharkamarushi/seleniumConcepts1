package selenium_learnAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfile_Demo {
 
      public static void main(String[] args) {
             
    	  	  // Create object of ProfilesIni class
             ProfilesIni init=new ProfilesIni();
             
             // Get the default session  
             FirefoxProfile profile=init.getProfile("selenium");
            // Pass the session/profile to FirefoxDriver 
            
             WebDriver driver=new FirefoxDriver(profile);
             driver.get("http://learn-automation.com/");
            // driver.quit();
      }
 }