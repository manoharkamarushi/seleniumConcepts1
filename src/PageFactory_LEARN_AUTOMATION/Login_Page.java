package PageFactory_LEARN_AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class Login_Page {

		
	@FindBy(id="user_login")
	WebElement uname;
	
//	@FindBy(id="user_pass") 
	
	@FindBy(how=How.ID,using="user_pass")
	WebElement pwd;
	
//	@FindBy(id="wp-submit")
	
	@FindBy(how=How.ID,using="wp-submit")
	@CacheLookup
	WebElement login;
	
public void login_wordPress(String u1,String p1){	

	uname.sendKeys(u1);
	Reporter.log("username: "+u1+"entered");
	
	pwd.sendKeys(p1);
	Reporter.log("password: :"+p1+"entered");
	
	login.click();
	Reporter.log("login button clicked");
	
     }
}
