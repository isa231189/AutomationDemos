package QualityAutomationLearn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.WebDriverWait;



public class MercuryToursAutomatedTest {
    
    private WebDriver driver;

    // Localizadores
   
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
    
    
    @Before
    public void setUp() throws Exception {
        // Corregir el nombre de la propiedad del sistema
        System.setProperty("wedriver.chrome.driver", "./src/test/resources/chromedriver.chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");
    }

    @After
    public void tearDown() throws Exception {
      //  driver.quit(); // Cerrar el navegador después de la prueba
    }

    @Test
   /* public void registerUser() throws InterruptedException {
        // Hacer clic en el botón de login
        driver.findElement(loginButtonLocator).click();
        
        // Esperar para que el modal se cargue
        Thread.sleep(2000);

        // Verificar si el modal se abrió
        WebElement modal = driver.findElement(registerPageLocator);
        if (modal != null && modal.isDisplayed()) {
           
        	
        	// Rellenar el formulario de login
        	
            driver.findElement(usernameLocator).sendKeys("qualityadmin");
            driver.findElement(passwordLocator).sendKeys("qualitypass");
            driver.findElement(buttonLocator).click();
        } else {
            System.out.println("Register Page was not found");
        }
    }*/
    
  /*  	
    	driver.findElement(categoriesPhoneLocator).click();
    	Thread.sleep(2000);
    	
    	if(driver.findElement(BodySelector).isDisplayed()) {
    		
    		driver.findElement(SelectcardHTCLocator).click();
    	}
    	
    	else{System.out.print("Not found this phone");}
    	
   
      if(driver.findElement(BodyCaracteristicsSelector).isDisplayed()) {
    		
    		driver.findElement(ButtonCart).click();
    		
    		Thread.sleep(2000);
    	} else
    	
    	{System.out.print("Error");
    	
    	
    	}
    		
    		
    	
    	driver.findElement(CartLocator).isDisplayed();
    		
    	driver.findElement(PlaceOrderButtonLocator).click();
    	
    	Thread.sleep(2000);
    		
    	 WebElement modalplaceorder = driver.findElement(FormPlaceOrder);
         if (modalplaceorder != null && modalplaceorder.isDisplayed()) {
    			

             driver.findElement(nameuserorderLocator).sendKeys("yeisa"); 
             driver.findElement(countryuserorderLocator).sendKeys("Cuba");
             driver.findElement(cityuserorderLocator).sendKeys("La Habana");
             driver.findElement(credituserorderLocator).sendKeys("89112323850");
             driver.findElement(monthuserorderLocator).sendKeys("11");
             driver.findElement(yearuserorderLocator).sendKeys("2023");
             
             
             
             driver.findElement(buttonplaceorder).click();
         } else {
             System.out.println("Error en Purchase");
         }
    			
    			
    		
    		}*/
    
    		
    public void SelectCategories() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            // Seleccionar la categoría "Phones"
            WebElement categoryPhone = wait.until(ExpectedConditions.elementToBeClickable(categoriesPhoneLocator));
            categoryPhone.click();

            // Verificar si se muestra el cuerpo del selector
            WebElement bodySelector = wait.until(ExpectedConditions.visibilityOfElementLocated(BodySelector));
            if (bodySelector.isDisplayed()) {
                driver.findElement(SelectcardHTCLocator).click();
            } else {
                System.out.println("Not found this phone");
                return;
            }

            // Verificar si se muestran las características del cuerpo
            WebElement bodyCaracteristics = wait.until(ExpectedConditions.visibilityOfElementLocated(BodyCaracteristicsSelector));
            if (bodyCaracteristics.isDisplayed()) {
                driver.findElement(ButtonCart).click();
            } else {
                System.out.println("Error en las características del producto");
                return;
            }

            // Navegar al carrito y hacer clic en el botón de ordenar
            WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(CartLocator));
            cart.click();

            WebElement placeOrderButton = wait.until(ExpectedConditions.elementToBeClickable(PlaceOrderButtonLocator));
            placeOrderButton.click();

            // Esperar a que el formulario modal de "Place Order" aparezca
            WebElement modalPlaceOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(FormPlaceOrder));
            if (modalPlaceOrder.isDisplayed()) {
                driver.findElement(nameuserorderLocator).sendKeys("yeisa");
                driver.findElement(countryuserorderLocator).sendKeys("Cuba");
                driver.findElement(cityuserorderLocator).sendKeys("La Habana");
                driver.findElement(credituserorderLocator).sendKeys("89112323850");
                driver.findElement(monthuserorderLocator).sendKeys("11");
                driver.findElement(yearuserorderLocator).sendKeys("2023");

                driver.findElement(buttonplaceorder).click();
            } else {
                System.out.println("Error en Purchase");
            }

        } catch (Exception e) {
            System.out.println("Error durante la ejecución: " + e.getMessage());
        }
    }
    	
    }
    	
    	
    	
    


