package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Millionclouds_reg {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://millionclouds.com");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  Screen s=new Screen();
	  try {
		s.click(".\\images\\register.PNG");
		
	//	s.find(".\\images\\email.PNG");
		s.type(".\\images\\email1.PNG", "bujuka@gmail.com");
		
		s.type(".\\images\\re_email.PNG", "bujuka@gmail.com");
		s.type(".\\images\\password.PNG", "password");
		s.type(".\\images\\re_password.PNG", "password");
		
		s.click(".\\images\\signup.PNG");
		s.click(".\\images\\cancel.PNG");
		//s.click(".\\images\\close_window.PNG");
		
		
	} catch (FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.close();
  }
}
