package selenium_learnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Custom_Waits_Utlity {
	
//	public static WebElement isElePrsnt_xpath(WebDriver driver,String loctype,String locator,int time){
	public static WebElement isElePrsnt(WebDriver driver,String xpath1,int time){
	
//	String xpath=null;
	WebElement ele=null;
	
	for(int i=0;i<time;i++){
		
		try{
			ele=driver.findElement(By.xpath(xpath1));
			break;
			}
		catch(Exception e){
			try{
				Thread.sleep(3000);
				}catch(Exception e1){
					System.out.println("waiting for element to present in DOM");
				}
			}
		}
			
		return ele;
	}
	
/*public static WebElement isElePrsnt_id(WebDriver driver,String xpath,int time){
		
		WebElement ele=null;
		for(int i=0;i<time;i++){
			
			try{
				ele=driver.findElement(By.id(""));
				break;
				}
			catch(Exception e){
				try{
					Thread.sleep(3000);
					}catch(Exception e1){
						System.out.println("waiting for element to present in DOM");
					}
				}
			}
				
			return ele;
				
		}*/
}
