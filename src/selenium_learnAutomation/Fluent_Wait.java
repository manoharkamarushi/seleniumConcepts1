package selenium_learnAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Fluent_Wait {
	public static void main(String[] args){
//  Max 90% we use explicit wait, it explicit wait there are certain pre conditions
//	other than those preconds we cant use ...but in fluent wait we can implement our own 
//	conditions ..and we can set the frequency of how many times it should check the condition
//	before throwing exception.
	
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

//Click on timer so clock will start
driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
// create an object of fluent wait and pass the object of webdriver

FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);

// It should poll webelement after every single second
		fwait.pollingEvery(1, TimeUnit.SECONDS);
// Max time for wait- If conditions are not met within this time frame 
// then it will fail the script
		 
        fwait.withTimeout(10, TimeUnit.SECONDS);	
// we are creating Function here which accept webdriver and output as WebElement-
        
        WebElement element = fwait.until(new Function<WebDriver, WebElement>() {

        	// apply method- which accept webdriver as 
        	@Override
            public WebElement apply(WebDriver arg0) 
            {
             
                  // find the element
             
             WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
             
            // Will capture the inner Text and will compare will WebDriver
             
            // If condition is true then it will return the element and wait will be over
             
             if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
                                  {
             
                                      System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
             
                                      return ele;
             
                                 }
             
            // If condition is not true then it will return null and it will keep checking until condition is not true
             
            else {
                    System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
             
                       return null;
             
                   }
             
                           }
             
                      });
             
            // If element is found then it will display the status
             
                      System.out.println("Final visible status is >>>>> " + element.isDisplayed());
             
                 }
             
                        
		
        
}
