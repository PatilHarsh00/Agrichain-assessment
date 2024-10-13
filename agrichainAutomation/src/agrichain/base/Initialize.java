package agrichain.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	public static WebDriver driver;
	
	public static void testIntialization() {
		System.setProperty("webdriver.chrome.driver","/Users/harsh_patil/selenium/chromedriver_mac_arm64");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://agrichain.com/qa/input");
	}
}
