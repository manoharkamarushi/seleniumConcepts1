package grid_Parallel;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Calc_1 {


 @Test(dataProvider = "getCalcData")
 public static void calcTest(String browser, String num1, String num2, String expSumNum) throws MalformedURLException, InterruptedException {

  System.out.println(browser);

  
  DesiredCapabilities cap = null;

  if (browser.equals("firefox")) {
   
   cap = DesiredCapabilities.firefox();
   Reporter.log("cap set for firefox...",true);
   cap.setBrowserName("firefox");
   Reporter.log("cap set for browsername: firefox",true);
   cap.setPlatform(Platform.WINDOWS);
   Reporter.log("cap set for platform: windows",true);
  } else if (browser.equals("chrome")) {
   
   cap = DesiredCapabilities.chrome();
   Reporter.log("cap set for chrome...",true);
   cap.setBrowserName("chrome");
   Reporter.log("cap set for browsername : chrome",true);
   cap.setPlatform(Platform.WINDOWS);
   Reporter.log("cap set for platform : windows",true);
   
  } else if (browser.equals("iexplore")) {
  
   cap = DesiredCapabilities.internetExplorer();
   Reporter.log("cap set for ie...",true);
   cap.setBrowserName("internet explorer");
   Reporter.log("cap set for browsername : ie",true);
   cap.setPlatform(Platform.WINDOWS);
   Reporter.log("cap set for platform : windows",true);
  }

  //Initialize RemoteWebDriver on grid 2 node with browser capability.
  RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
  Reporter.log("remote webdriver set with hub url",true);
  driver.manage().window().maximize();
  Reporter.log("browser maximised",true);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  Reporter.log("implicit wait set",true);

  // Pause test for secs to check exactly how many concurrent browsers opening at same time.
//  Thread.sleep(000);

  driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
  Reporter.log("AUT url opened",true);
  driver.findElement(By.xpath("//input[@id='Resultbox']")).clear();
  driver.findElement(By.xpath("//input[@id='" + num1 + "']")).click();
  driver.findElement(By.xpath("//input[@id='plus']")).click();
  driver.findElement(By.xpath("//input[@id='" + num2 + "']")).click();
  driver.findElement(By.xpath("//input[@id='equals']")).click();

  // Get actual result and compare with expected result.
  String strResult = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
  int actualResult = Integer.parseInt(strResult);Reporter.log("result converted into string",true);
  int expectedResult = Integer.parseInt(expSumNum);Reporter.log("exp sum converted into string",true);
  Assert.assertEquals(actualResult, expectedResult);

  // Close browser instance.
  driver.quit();
 }

 // Created @DataProvider annotation method to supply data(browser name, num1, num2 and expected sum value) for test
 @DataProvider(parallel = true)
 public Object[][] getCalcData() {
  Object data[][] = new Object[2][4];
  data[0][0] = "firefox";
  data[0][1] = "1";
  data[0][2] = "3";
  data[0][3] = "4";

  data[1][0] = "chrome";
  data[1][1] = "2";
  data[1][2] = "5";
  data[1][3] = "7";

  /*data[2][0] = "iexplore";
  data[2][1] = "3";
  data[2][2] = "5";
  data[2][3] = "8";
*/
  return data;
 }

}

