package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends base {

	By nameuserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input");
    By loginButtonLocator = By.id("login2");
    By registerPageLocator = By.id("logInModal");
    By usernameLocator = By.id("loginusername");
    By passwordLocator = By.id("loginpassword");
    By buttonLocator = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    By categoriesPhoneLocator = By.xpath("//*[@id=\"itemc\"]");
    By SelectcardHTCLocator = By.xpath("/html/body/div[5]/div/div[2]/div/div[7]/div");
    By BodySelector = By.id("tbodyid");
    By BodyCaracteristicsSelector = By.xpath("/html/body");
    By ButtonCart = By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
    By CartLocator = By.name("cartur");
    By ProductsCartLocator = By.xpath("/html/body");
    By PlaceOrderButtonLocator = By.xpath("/html/body/div[6]/div/div[2]/button");
    By FormPlaceOrder = By.xpath("/html/body/div[3]/div/div");
    By countryuserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input");
    By credituserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/input");
    By cityuserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/input");
    By monthuserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[5]/input");
    By yearuserorderLocator = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[6]/input");
    By buttonplaceorder = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    
    
    
	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
    
    
    

}
