fpackage selenium_learnAutomation;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class FIleUpload_Robot {
 WebDriver driver;
@Test
public void f() throws InterruptedException, AWTException {
		
//Specify the file location with extension,
//it is a java class,Creates a Transferable capable of transferring the specified String.
StringSelection sel = new StringSelection("C:\\Users\\manu\\Desktop\\sel.docx");

//Copy to clipboard
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
System.out.println("selection" +sel);

//This will scroll down the page 
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scroll(0,350)");		
System.out.println("window scrolling......");
driver.findElement(By.id("wordresume")).click();
System.out.println("Browse button clicked");

// Create object of Robot class
Robot robot = new Robot();
Thread.sleep(1000);

//Press CTRL+V
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
System.out.println("paste taken");
//Release CTRL+V
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
Thread.sleep(1000);
System.out.println("paste released");

//Press Enter
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("enter pressed");
// release Enter 
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("enter released");
}
@BeforeTest
public void beforeTest() {

 driver=new FirefoxDriver();
 driver.get("http://my.monsterindia.com/create_account.html");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 
}

@AfterTest
  public void afterTest() {
//driver.close();
  }

}
