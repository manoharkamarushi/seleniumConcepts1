package selenium_learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tooltip {

	@Test(enabled=false)
public void tooltip(){
	

	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://seleniumhq.org");
    
	String title=driver.findElement(By.linkText("Browser Automation")).getText();
    System.out.println(title);
    
    String tp=driver.findElement(By.linkText("Browser Automation")).getAttribute("title");
    Assert.assertEquals("Return to Selenium home page", tp);
  
	int n=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(n);
}
@Test
public void tp2(){
WebDriver driver=new FirefoxDriver();
	
	driver.get("https://jqueryui.com/tooltip/");
	driver.manage().window().maximize();
	
	WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	WebDriverWait w=new WebDriverWait(driver,15);
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	
	WebElement age=driver.findElement(By.id("age"));
	
//	Actions a=new Actions(driver);
//	a.moveToElement(age).doubleClick().build().perform();
//	a.moveToElement(age).build().perform();
	new Actions(driver).moveToElement(age).click().sendKeys("87").build().perform();
  
	
	WebElement tp=driver.findElement(By.xpath("//div[contains(@class,'ui-helper-hidden-accessible')]/div"));

	String s=tp.getText();
	System.out.println(s);

Assert.assertEquals("We ask for  age only for statistical purposes.", tp.getText());
}
	
}
