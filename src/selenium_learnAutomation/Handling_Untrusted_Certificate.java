package selenium_learnAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Handling_Untrusted_Certificate {
 /* synonyms- how u handle untrusted certificate web pages 
  * 		- how u handle http application
  * 		- how u handle unsecured applications
			- how u handle secure certificates
*/

	@Test
  public void UC() {
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 

//		selenium has already predefined capabilities,here 'capability type' is an interface
//		it means whenever we are getting untrusted cert. accept and continue...
//    and i dont want to start defualt firefox session ,so i am starting a session with this 'dc' capability
		
		WebDriver driver=new FirefoxDriver(dc);
		driver.get("http://www.cacert.org");
		
	//it will acccept & opens the page as earlier
}
}
