package flipcart.com.pageobjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

public class FlipCart {
	private WebDriver driver;
	public FlipCart(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void hoverMenDropDown() {
		//_2FZd5H
		Actions actions = new Actions(driver);
		WebElement option = driver.findElement(By.className("_2FZd5H"));
	    actions.moveToElement(option).build().perform();;
	}
	//
	public WebElement clickOnTShirt() {
		return Utils.waitToBeClickable(driver, By.xpath("//a[contains(text(),'T-Shirts')]"),30);
	}
	
	public WebElement enterTextOnSearch() {
		//vh79eN
		return Utils.waitToBeClickable(driver, By.xpath("//div[@class='O8ZS_U']/input"),30);
	}
	
	public WebElement clickSearchButton() {
		//vh79eN
		return Utils.waitToBeClickable(driver, By.className("vh79eN"),30);
	}
	
	public WebElement detailParameters(){
		return Utils.waitToBeClickable(driver, By.xpath("//div[@class='col col-7-12']"),30);
	}
	
	public WebElement clickOnHighToLow(){
		return Utils.waitToBeClickable(driver, By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]"),30);
	}
	
}
