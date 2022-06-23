package selenium_learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementLocation {
	
//	1. Identify the webElement
//	2. know the width,height of that element
//	3. know the co-ordinates of the element using POINT class
	
	@Test
	public void f(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		WebElement img=driver.findElement(By.xpath(//a[@title="Test Image To Verify Tooltip"]));
		
		Point p=img.getLocation();
		
		System.out.println("X cos:"+p.getX());
		System.out.println("Y cos:"+.getY());
		
		
		
	}
	

}
