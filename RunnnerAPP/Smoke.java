package RunnnerAPP;

import org.openqa.selenium.WebDriver;

import PageObjectModels.HomePage;
import PageObjectModels.base;

public class Smoke {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = base.getdriver();
		
		HomePage HP = new HomePage (driver);
	/*	HP.SpeakLanguagesClickable();
		HP.SpeakLanguageLogoDisplay();
		HP.LoginButtonDisplay();
		HP.SignUpButtonDisplay();
		HP.SearchboxinputDisplay();
		HP.SearchboxButtonDisplay();
	*/	
		HP.SearchingWithValidData();
		driver.navigate().back();
		HP.SearchingWithInvalidData();
		driver= base.tearDown();
			
		

	}

}
