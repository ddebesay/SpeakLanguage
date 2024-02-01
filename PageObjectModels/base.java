package PageObjectModels;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  base{
	static 	WebDriver driver;
		
		public static WebDriver getdriver ( ) {
			
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://www.speaklanguages.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return driver;
			
		
			
		}
		public static WebDriver tearDown () {
			driver.quit();
			return driver;
		}
	}


