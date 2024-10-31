package QualityAutomationLearn;

import static org.junit.Assert.assertEquals;
import java.time.Duration;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
	
	private WebDriver driver;
	
	
	
	
	@Before 
	
	public void SetUp() {
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
	}
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void TestGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		
		searchbox.sendKeys("testing exploratorio");
		
		searchbox.submit();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait	
		//WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//ewait.until(ExpectedConditions.titleContains("testing exploratorio"));
		
		
		
		assertEquals ("testing exploratorio - Google Search", driver.getTitle());
	}
	
	
	/*public void localizadores() {
		
		By locator = By.id("id_del_elemento");
		
		By locator_name = By.name("name_element");
		
		By locator_className = By.className("clase_elemento");
		
		By locator_tagname = By.tagName("tag");
		
		By locator_link_text = By.tagName("tag");
		
		By locator_linktect = By.linkText("texto_link");
		
		By locator_cssSelector = By.cssSelector(null);
				
		By locator_partialLinktext = By.partialLinkText( "partial_link");
		
		By locator_Xpath = By.xpath("//input[@name='q']");
		
	}*/
		
	
	@After
	public void TearDown() {
		
		driver.quit();
		
	}
}
