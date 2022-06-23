package grid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class seleniumgridexample  {
	WebDriver driver=new FirefoxDriver();
	String baseURL,nodeURL;
  
	@Test
    public void gridtest() throws Exception {
	  
	  driver.get(baseURL);
	  driver.findElement(By.id("Email")).sendKeys("mindqselenium15@gmail.com");
	  driver.findElement(By.id("next")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("Passwd")).sendKeys("mindq@123");
	  driver.findElement(By.id("signIn")).click();
	  Compose();
				  
}
	  
  public  void Compose() throws Exception
	{
		Thread.sleep(40000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
	  	Thread.sleep(10000);
	  	driver.findElement(By.name("to")).sendKeys("sudheera.adusupalli@hotmail.com");
	  	driver.findElement(By.name("subjectbox")).sendKeys("Hi");
	  	driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome to selenium class");
		 Thread.sleep(10000);
		  
		 driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

  @BeforeMethod
  public void setUp()throws MalformedURLException {
	  
	  baseURL="http://gmail.com";
	  nodeURL="http://192.168.0.196:5556/wd/hub";
	  
	  DesiredCapabilities capability= DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  capability.setPlatform(Platform.WINDOWS);
	  driver=new RemoteWebDriver(new URL(nodeURL), capability);
  }
  
  @BeforeClass
  public void before() throws Exception{
	   String BaseURL="http://www.google.com";
	   String NodeURL="http://localhost:4444/wd/hub";
	    File file = new File("C:\\Users\\pushkaryova\\Desktop\\Nexus\\driver\\chromedriver.exe");
	    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    DesiredCapabilities capa =DesiredCapabilities.chrome();
	    capa.setBrowserName("chrome");
	    capa.setPlatform(Platform.ANY);
	    driver=new RemoteWebDriver(new URL(NodeURL),capa);
	}
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Before Quitting");
	  driver.quit();
  }

}

