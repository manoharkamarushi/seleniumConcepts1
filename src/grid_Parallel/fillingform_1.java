package grid_Parallel;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class fillingform_1 {
	 //Can accept object array data(browser name, First Name and Last Name) from getNames method.
	 @Test(dataProvider = "getNames")
	 public void fillingForm(String browser, String fName, String lName) throws MalformedURLException, InterruptedException {
	  
	  //Initialize DesiredCapabilities null.
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
	  
	  //Open URL in requested browsers of node and execute test steps.
	  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	  Reporter.log("AUT url opened",true);
	  driver.findElement(By.name("FirstName")).sendKeys(fName);
	  Reporter.log("FirstName set",true);
	  driver.findElement(By.name("LastName")).sendKeys(lName);
	  Reporter.log("LastName set",true);
	  driver.quit();
	  Reporter.log("driver session closed successfully",true);
	  Reporter.log("--------------------------------------------", true);
	  
	  }
	 
	 @DataProvider(parallel=true) // parallel = true ......
	 public Object[][] getNames(){
		 
	  Object data[][] = new Object[2][3];
	  
	  data[0][0] = "firefox";
	  Reporter.log("firefox name sent from array",true);
	  data[0][1] = "FirstName1";
	  Reporter.log("firstname sent from array",true);
	  data[0][2] = "LastName1";
	  Reporter.log("last name sent from array",true);
	  
	  data[1][0] = "chrome";
	  Reporter.log("chrome name sent from array",true);
	  data[1][1] = "FirstName2";
	  Reporter.log("firstname sent from array",true);
	  data[1][2] = "LastName2";
	  Reporter.log("Lastname sent from array",true);
	  
	  /*data[2][0] = "iexplore";
	  data[2][1] = "FirstName3";
	  data[2][2] = "LastName3";  */
	  
	  return data;
	 }
}
