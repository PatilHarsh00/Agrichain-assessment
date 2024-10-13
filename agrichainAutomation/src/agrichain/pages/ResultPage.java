package agrichain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
	WebDriver driver;
	
	WebElement result = driver.findElement(By.id("output"));
	WebElement backButton = driver.findElement(By.xpath("//div[containes(text(),'Back to Home')]"));
	
	public ResultPage (WebDriver driver){
		this.driver = driver;
	}
	
	public String getResult() {
		return result.getText();
	}
	
	public void clickBackButton() {
		backButton.click();
	}
	
}
