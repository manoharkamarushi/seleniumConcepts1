package cookies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CookieHandleTest {
  WebDriver driver=null;

  @BeforeMethod(enabled=true)
 public void init(){
	  
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
  }
	@Test(enabled=false)
public void readCookies() {
 
//	  Cookie cookie=new Cookie(null, null);
	  
	  Set<Cookie> cookielist=driver.manage().getCookies();
	  System.out.println("Total cookies:"+cookielist.size());
	  for(Cookie ck:cookielist){
		  
	System.out.println(ck.getName()+";\n"+ck.getValue()+";\n"+
	ck.getDomain()+";\n"+ck.getPath()+";\n"+ck.getExpiry()+";\n");
		 System.out.println("---------"); 
	  }
	}
@Test(enabled=false)
public void methodsCookies(){
	
	driver.manage().getCookies();
	driver.manage().getCookieNamed(null);
	driver.manage().addCookie(null);
	
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookie(null);
	driver.manage().deleteCookieNamed(null);
	
}

@Test
public void writeToFile() throws IOException{
		
File f=new File("E:\\work space\\SELENIUM2\\Selenium_Concepts_NEW\\test-output\\cookie.data");

FileWriter fw=new FileWriter(f);
BufferedWriter bw=new BufferedWriter(fw);

		System.out.println("file created successfully");
		System.out.println("writing cookie data to a file");
		Set<Cookie>cklist=driver.manage().getCookies();
		for(Cookie ck:cklist){
				
			bw.write(ck.getName()+";\n"+
					ck.getValue()+";\n"+
					ck.getDomain()+";\n"+
					ck.getPath()+";\n"+
					ck.getExpiry()+";");
			
			 bw.write("---------"); 
		}
		
		bw.close();
		fw.close();
		
	}
		
		
	}

	

	
	

  

