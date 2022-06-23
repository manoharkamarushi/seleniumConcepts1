package Retry_Failed_2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTests {
	
		WebDriver driver;
		String baseURL = "https://www.linkedin.com/";

		@BeforeTest
		public void setup() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		@Test(priority=1)
		public void verifyLoginPageText() {
			driver.navigate().to(baseURL);
			System.out.println("Verify login page test started");
//			WebElement element = driver.findElement(By.cssSelector(".header>h2"));
			WebElement element = driver.findElement(By.xpath("//h1[text()='Be great at what you do']"));
			String headerText = element.getText();
			System.out.println(headerText);
			Assert.assertEquals(headerText, "Get started – it’s free.");
		}

		@Test(priority=2)
		public void verifyForgotPasswordPage() {
			driver.navigate().to("https://www.linkedin.com/uas/request-password-reset?trk=uno-reg-guest-home-forgot-password");
			System.out.println("Verify Forgot password page test started");
			WebElement element = driver.findElement(By.linkText("Forgot your password?"));
			element.click();
//			WebElement pageTextElement = driver.findElement(By.cssSelector(".flow-login-content>fieldset>h1"));
			WebElement pageTextElement = driver.findElement(By.xpath("//h2[text()='Please enter your email or phone']"));
			String pageText = pageTextElement.getText();
			System.out.println(pageText);
			Assert.assertEquals(pageText, "Wrong text");
			//Assert.assertEquals(pageText, "Change your password");
		}
	}

