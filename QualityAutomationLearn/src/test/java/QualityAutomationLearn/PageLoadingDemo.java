package QualityAutomationLearn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingDemo {
	
	private WebDriver driver;
	
@Before 
	
	public void SetUp() {
	
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		
		
}

@Test




@After

public void TearDown() {
	
	driver.quit();
	

}

}
