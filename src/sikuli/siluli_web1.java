package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class siluli_web1 {
	

	public static void main(String[] args) throws FindFailed {
		System.out.println("hello");
		
		
		WebDriver driver;
		System.setProperty("webdiver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://youtu.be/ztA__cx5xDU");
	      
		Screen s=new Screen();
		s.find("pause.PNG");
		s.click("pause.PNG");
		
		s.find("mute.PNG");
		s.click("mute.PNG");
		
		

	}

}
