package flipcart.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class SignInForm {
private WebDriver driver;
	
	public SignInForm(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEnterEmailMobileNumber() {
		return Utils.waitToBeClickable(driver, By.xpath("//input[@class='_2zrpKA _1dBPDZ']"),30);
	}
	
	public WebElement getEnterPassword() {
		return Utils.waitToBeClickable(driver, By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"),30);
	}
	
	public WebElement getLoginBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"),20);
	}
	public WebElement hoverUserName() {
		return Utils.waitToBeClickable(driver, By.className("_2aUbKa"),30);
	}

}
