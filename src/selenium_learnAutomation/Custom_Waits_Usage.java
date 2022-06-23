package selenium_learnAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Custom_Waits_Usage {


@Test
public void checkBuses(){

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	Custom_Waits_Utlity.isElePrsnt(driver,".//*[@id='txtSource']",20).sendKeys("");
	Custom_Waits_Utlity.isElePrsnt(driver,".//*[@id='txtDestination']",25).sendKeys("");
	
}

}
