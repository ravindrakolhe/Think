package thinkitiveassigenment.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import flipcart.com.pageobjects.SignInForm;
import flipcart.com.pageobjects.FlipCart;

public class ThinkitiveAssigenmentsFlipcarts {
	private WebDriver driver;
	private SignInForm signin;
	private FlipCart flipcart;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver =  new FirefoxDriver();
		signin = new SignInForm(driver);
		flipcart = new FlipCart(driver);
		
		String baseUrl = "https://www.flipkart.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	@AfterClass
	public void closeAll() {
		driver.quit();
	}
	@Test(priority = 1)
	public void signInPage() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signin.getEnterEmailMobileNumber().sendKeys("ravindra484@gmail.com");
		signin.getEnterPassword().sendKeys("sai123456");
		signin.getLoginBtn().click();
		Thread.sleep(2000);
		flipcart.hoverMenDropDown();
		flipcart.clickOnTShirt().click();
		signin.hoverUserName();
	}
	
}
