package agrichain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	WebElement inputField = driver.findElement(By.xpath("//div[containes(text(),'Enter String Input')]"));
	WebElement submitButton = driver.findElement(By.xpath("//div[containes(text(),'Submit')]"));
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterInput(String input) {
		inputField.sendKeys("input");
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
}
