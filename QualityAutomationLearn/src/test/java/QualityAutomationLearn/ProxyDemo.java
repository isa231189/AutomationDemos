package QualityAutomationLearn;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyDemo {
	
	private WebDriver driver;
	
	
	@Before 
	public void SetUp() {
		
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		//proxy.setHttpProxy("localhost:8080");
		proxy.setSslProxy("localhost:8080");
	
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(options);
		
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://google.com/"); 
		driver.quit();
		
	}

	
	@Test
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	
	public void TearDown() {
		
		driver.quit();
		}

}
