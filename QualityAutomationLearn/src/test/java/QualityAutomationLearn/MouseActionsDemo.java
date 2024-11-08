package QualityAutomationLearn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
	private WebDriver driver;
	
	By letterA = By.name("A") ;
	By letterD = By.name("D") ;
	
	By drag = By.xpath("//*[@id=\"draggable\"]");
	By drop = By.id("droppable");
	
	@Before 
	
	public void SetUp() {
	
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");*/
		}
		
		/*@Test
		public void ClickandHold() throws InterruptedException {
			
			
			WebElement A = driver.findElement(letterA);
			WebElement D = driver.findElement(letterD);
			
			Actions action = new Actions(driver);
			action.moveToElement(A);
			action.clickAndHold();
			action.moveToElement(D);
			//action.doubleClick(D);
			
			action.release().perform();
			
			Thread.sleep(3000);
			System.out.print("Done");
		}*/
		 
		@Test
		public void DragDrop() throws InterruptedException {
			driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
			
			WebElement Drag = driver.findElement(drag);
			WebElement Drop = driver.findElement(drop);	
			
			Actions action = new Actions(driver);
			action.moveToElement(Drag);
			action.dragAndDrop(Drag,Drop);
			action.release().perform();
			
			Thread.sleep(3000);
			
			System.out.print("Done");
			
		
		
		}

		@After

		public void TearDown() {
			
			driver.quit();
			

		
		
}
	
	
	

}
