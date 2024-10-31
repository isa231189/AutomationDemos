package QualityAutomationLearn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alerts {
	
	private WebDriver driver;
	
	By locatorJSalert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
	By locatorJSconfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
By locatorJSprompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
	
	
	private boolean selecciomarok;

	
	
	
@Before 
	
	public void SetUp() {
		System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

@Test

public void SelectJSAlert() {
	
	driver.findElement(locatorJSalert).click();
	
	Alert alert1 = driver.switchTo().alert();
	
    System.out.println(alert1.getText());
	
	alert1 .accept();
	
	
	if (driver.getPageSource().contains("You successfully clicked an alert")) {
		System.out.println("You successfully clicked an alert");
		
		System.out.println("===============");
	}
}

@Test

public void SelectJSConfirm() {

	
	driver.findElement(locatorJSconfirm).click();
	
	Alert alert2 = driver.switchTo().alert();
	
	System.out.println(alert2.getText());
	
	
	if(setSelecciomarok(true)) {
	
	
		alert2.accept() ;
	    driver.getPageSource().contains("You clicked: Ok"); 
		System.out.println("You clicked: Ok");
	}
		
	 else {
		
		alert2.dismiss();
		driver.getPageSource().contains("You clicked: Cancel");
	    System.out.println("You clicked: Cancel");	
		
	
	}
	
	
}


@Test

public void SelectJSprompt() {
	
	
	driver.findElement(locatorJSprompt).click();
	
	Alert alert3 = driver.switchTo().alert();
	
	System.out.println(alert3.getText());
	 alert3.sendKeys("Hola Prompt");
	
	alert3.accept();
	
	if (driver.getPageSource().contains("Hola Prompt")) {
		System.out.println("You entered: Hola Prompt");
		
		System.out.println("===============");
	}
	
	
}


@After
public void TearDown() {
	
	driver.quit();
	}

public boolean isSelecciomarok() {
	return selecciomarok;
}

public boolean setSelecciomarok(boolean selecciomarok) {
	this.selecciomarok = selecciomarok;
	return selecciomarok;
}



}






