package agrichain.tests;

import agrichain.base.Initialize;
import agrichain.pages.HomePage;
import agrichain.pages.ResultPage;
import org.testng.Assert;

public class sanityTest {
	
	public void setup() {
		Initialize.testIntialization();
	}
	
	public void sanityTesting() {
		HomePage homePage = new HomePage(Initialize.driver);
		ResultPage resultPage = new ResultPage(Initialize.driver);
		
		// Test input and submit button
		homePage.enterInput("abcabcbb");
		homePage.clickSubmitButton();
		
		// Test result and back button
		String currentURL = Initialize.driver.getCurrentUrl();
		String expectedURL = "https://agrichain.com/qa/result";
		int expectedOutput = 3;
		
		Assert.assertEquals(currentURL, expectedURL, "URL doesn't match");
		String actualOutput = resultPage.getResult();
		Assert.assertEquals(actualOutput, expectedOutput, "The output does not match");
		resultPage.clickBackButton();
	}
}
