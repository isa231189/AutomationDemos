package QualityAutomationLearn;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementDemo {
	
	private WebDriver driver;
	
	@Before 
		
		public void SetUp() {
		
		//ChromeOptions options = new ChromeOptions();
	//	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://trytestingthis.netlify.app/");
			
			
			
	}

	@Test

public void FindElementDemo() throws InterruptedException {
		
		List<WebElement> elementos = driver.findElements(By.tagName("selectelemnt"));
		for(WebElement element: elementos) {
			System.out.println(")ParegrafText:"+ element.getText());
		}
		
		Thread.sleep(1000);	
	}


	@After

	public void TearDown() {
		
		driver.quit();
		

	}


}
