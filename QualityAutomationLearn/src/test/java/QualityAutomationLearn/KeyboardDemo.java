package QualityAutomationLearn;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class KeyboardDemo {
	
private WebDriver driver;


	
	@Before 
		
		public void SetUp() {
		
			System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			
			
			
	}

/*	@Test

 public void SendKeys() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		
		Thread.sleep(2000);
	}*/

	/*@Test
	
	public void keyDown () throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		
		Thread.sleep(2000);
	}*/
	
	@Test
	public void KeyUp() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement  searchBox = driver.findElement(By.name("q"));
		
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium")
		.keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
		
		Thread.sleep(4000);
		 
		searchBox.clear();
	}
	
	
	@After

	public void TearDown() {
		
		driver.quit();
		

	}



}
