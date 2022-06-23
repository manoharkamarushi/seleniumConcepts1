package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Youtube {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http:youtube.com");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  Screen s=new Screen();
	  s.type(".\\images\\u_search.PNG", "kabali teaser official");
	  try {
		s.click(".\\images\\u_search_button.PNG");
		s.wait(".\\images\\kabali_title.PNG");
		s.click(".\\images\\kabali_title.PNG");
		
		s.click(".\\images\\u_pause.png");
		//s.click(".\\images\\u_mute.png");
		s.click("volume_dec.PNG");
		
	} catch (FindFailed e) {
		
		e.printStackTrace();
	}
	  
	  
  }
}
