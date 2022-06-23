package selenium_learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts_Complete {
 
	WebDriver driver;
  
  @Test
  public void f() {
	 
	driver=new FirefoxDriver();  
//	driver.get("http://redbus.in");  
	driver.navigate().to("http://redbus.in");
	String t=driver.getTitle();
	System.out.println(t);
	
	WebElement btn=driver.findElement(By.id("searh_btn"));
	
	Assert.assertTrue(btn.isDisplayed());
//	Assert.assertEquals(driver.getTitle().contains(t),t);
	
//	Assert.assertTrue(driver.getTitle().isEmpty());
//	Assert.assertTrue(driver.getTitle().endsWith(""), "message");
	

	
//	when u want to continue the execution if an element is not present in the page then we use
//	Assert.assertFalse(driver.getTitle().trim().equalsIgnoreCase("jaffa"), "jaffa is present so failed");
	
 }
  
@Test
public void Mysoftassert(){
	
	SoftAssert sassert=new SoftAssert();
//	softassert will not terminate the execution,if fails  test case just fails.
	
	driver.get("http://gmail.com");
	sassert.assertTrue(driver.getTitle().contains("gmail")," page not opened");
	
	sassert.assertAll();
//	Calling assertAll() will cause an exception to be thrown if at least one assertion failed.
}
}
