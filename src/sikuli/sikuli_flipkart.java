package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class sikuli_flipkart {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		WebDriver driver;
		driver=new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		Thread.sleep(4000);
		Screen s=new Screen();
		
//		s.find(".\\images\\search.PNG");
//		s.type(".\\images\\search.PNG", "jaffa");
		
		
	}

}
