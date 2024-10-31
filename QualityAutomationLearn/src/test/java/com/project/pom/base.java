package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import groovyjarjarantlr.collections.List ;

public class base {
	
	private WebDriver driver;
	
	
	public base(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebDriver ChromeDriverConnection() {
		
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
	}

	
	
	public WebElement finfElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	//public List <WebElement> findElements(By locator){
		//return driver.findElements(locator);
	//}
		
	
	
		public String getText(WebElement element) {
			
			return element.getText();
		}
	
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	
	public void click (By locator) {
		driver.findElement(locator).click();
	}
	
	
	public Boolean isDisplayed(By locator) {
		try {
			
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e ){
			return false;
			
		}
		
	}
	
	public void Visit(String URL) {
		driver.get(URL);
	}
	
	
	
}
