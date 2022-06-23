package pageFactory_ExecuteAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	@FindBy(linkText="Download")
	WebElement downloads;

	@FindBy(linkText="Browser Automation")
	WebElement homepage;
public void SeleniumPage() throws InterruptedException{
	
	downloads.click();
	Thread.sleep(2000);
	homepage.click(); 

	/*public void task() throws InterruptedException{
		
		
	}*/
}
}
