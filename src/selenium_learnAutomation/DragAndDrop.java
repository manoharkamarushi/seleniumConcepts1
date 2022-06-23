package selenium_learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DragAndDrop {
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://jqueryui.com/draggable/");
//	  driver.manage().window().maximize();
	  
	  
	  WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  
	  WebDriverWait w=new WebDriverWait(driver, 15);
	  w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
//	  w.until(ExpectedConditions.);
//	  w.withMessage("frame found");
	  
	  WebElement from=driver.findElement(By.id("draggable"));
	  WebElement to=driver.findElement(By.id("droppable")); 
	  Thread.sleep(2000);
	  
	  Actions a=new Actions(driver);
	  Action dd=a.clickAndHold(from).moveToElement(to).release(to).build();
	  		 dd.perform();
  }
  
  @Test
  public void mousehover() throws InterruptedException{
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("http://www.flipkart.com");
	  Thread.sleep(5000);
	  
	  WebElement ele=driver.findElement(By.xpath("//a[@title='Men']"));
	  new Actions(driver).moveToElement(ele).perform();
	  
	  
  }
}
