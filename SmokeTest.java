package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	SmokeTestData data = new SmokeTestData();

	@Given("^open the firefox application$")
	public void open_the_firefox_application() throws Throwable {
		data.driver=new FirefoxDriver();
		data.driver.get("http://www.facebook.com");
		
	}

	@When("^i enter the valid username and valid password$")
	public void i_enter_the_valid_username_and_valid_password() throws Throwable {
	    
		data.driver.findElement(By.id("email")).sendKeys("manohar.k584@gmail.com");
		data.driver.findElement(By.id("pass")).sendKeys("silverstar");
		data.driver.findElement(By.xpath("//input[@value='Log In'][@type='submit']")).submit();
		
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	    
		String title=data.driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Facebook"));
		
	}

}
