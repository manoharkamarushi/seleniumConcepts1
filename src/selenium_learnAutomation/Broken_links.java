package selenium_learnAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Broken_links {
  @Test
  public void VerifyBrokenlinks() throws Exception {
	  
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("http://www.mntsoft.co.in");
	  driver.manage().window().maximize();
	  
	  List<WebElement>links=driver.findElements(By.tagName("a"));
	  links.addAll(driver.findElements(By.tagName("img")));
	  
	  System.out.println("total links:"+links.size());
	  
	  for(int i=1;i<links.size();i++){
		  	WebElement ele=links.get(i);
		  		String l=ele.getAttribute("href");
		  		verifyURL(l);
	  }
  }
  
 public void verifyURL(String l) throws IOException, InterruptedException{
	 
	 URL  url=new URL(l);
	 HttpURLConnection link=(HttpURLConnection)url.openConnection(); 
		link.setConnectTimeout(3000);
		link.connect();
		
		if(link.getResponseCode()==200){
			
			System.out.println(l+"-------------"+link.getResponseMessage());
			}
		/*else if(link.getResponseCode()==link.HTTP_NOT_FOUND){
			System.out.println(l+"---------------"+link.getResponseMessage());
			
		}*/
	 
	 
	 
 } 
}
