package QualityAutomationLearn;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {
	
	private WebDriver driver;
	
	
@Before 
	
	public void SetUp() {
	
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		}
	
@Test

public void DropDown() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
}



@After

public void TearDown() {
	
	driver.quit();
	
}

}
