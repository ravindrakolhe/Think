package thinkitiveassigenment.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import flipcart.com.pageobjects.SignInForm;
import flipcart.com.pageobjects.FlipCart;
import java.util.List;

public class ThinkitiveAssigenment2 {
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
		signin.getEnterEmailMobileNumber().sendKeys("ravindraxyz@gmail.com");
		signin.getEnterPassword().sendKeys("xyz123456");
		signin.getLoginBtn().click();
		Thread.sleep(4000);
		flipcart.enterTextOnSearch().sendKeys("iphone");
		flipcart.clickSearchButton().click();
		Thread.sleep(5000);
		flipcart.clickOnHighToLow().click();
		Thread.sleep(3000);
			List<WebElement> element =  driver.findElements(By.xpath("//div[@class='col col-7-12']"));
		    for(WebElement web : element)
		    {
		        String parameters =  web.getText();
		        System.out.println("<======================================>");
		        System.out.println("Details : "+ parameters);
		        System.out.println("<======================================>");
		        break;
		   
		    }
	
	}
	
}
