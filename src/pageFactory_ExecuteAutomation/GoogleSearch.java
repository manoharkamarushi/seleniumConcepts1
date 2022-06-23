package pageFactory_ExecuteAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch {
	
@FindBy(id="lst-ib")
WebElement enterText;

@FindBy(xpath="//button[@aria-label='Google Search']")
WebElement searchbutton;

@FindBy(linkText="Selenium - Web Browser Automation")
WebElement seldownload;

public void  gsearch(String sendtext){
	
	enterText.sendKeys(sendtext);
	searchbutton.click();
	}


public SeleniumPage seldown() throws InterruptedException{
	
	seldownload.click();
	Thread.sleep(8000);
	return new SeleniumPage();
}

}
