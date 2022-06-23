package grid;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
 
public class My_GridTest 
{
 
@Test
public void runFirefox() throws MalformedURLException
{
 
// We have to mention browser which we want to use for test execution
//DesiredCapabilities cap=DesiredCapabilities.firefox();
	
	DesiredCapabilities cap=DesiredCapabilities.chrome();	
//	we just set the property at cmd prompt..not here
	Reporter.log("chrome browser set", true);
 
// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
 cap.setPlatform(Platform.WINDOWS);
 Reporter.log("windows platform set", true);
 
// Here you can use hub address, hub will take the responsibility to execute the test on respective node
URL url=new URL("http://localhost:4444/wd/hub");
Reporter.log("hub taken responsibility to execute this test on node", true); 

// Create driver with hub address and capability

WebDriver driver=new RemoteWebDriver(url, cap);
Reporter.log("remote webdriver set", true);

// start application
driver.get("http://learn-automation.com/");
Reporter.log("url set", true);

// get the title and print the same
System.out.println("Page title: "+driver.getTitle());
Reporter.log("title printed", true);

driver.close();
Reporter.log("driver closed", true);

}
 
}