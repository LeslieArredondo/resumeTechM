package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import objects.ObjectsResume;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stepsCreateAccount {

	ObjectsResume OR;
	
	public String URL = "https://resume.techmcne.com/log-in";
	String driverPath = "src/main/resources/drivers/chromedriver";
	public WebDriver driver;

	String name = "Leslie";
	String lastName = "Arredondo";
	String email = "LA00833807@TECHMAHINDRA.COM";
	String title = "SDET";
	String password = "hola1234";

	@BeforeTest
	private void startTesting() {
		System.out.println("Starting Loading");
	}

	@BeforeMethod
	private void startDriver() {
		System.out.println("Browser to be launch!");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Browser launched and maximized");
	}

	@Test()
	public void steps() throws InterruptedException {

		System.out.println("User click on Create An Account");
		OR.CreateAnAccountButton.click();
		
		System.out.println("User enter first name");
		OR.firstNameInput.click();
		OR.firstNameInput.sendKeys(name);
		
		System.out.println("User enter last name");
		OR.lastNameInput.click();
		OR.lastNameInput.sendKeys(lastName);
		
		System.out.println("User enter email");
		OR.emailInputt.click();
		OR.emailInputt.sendKeys(email);
		
		System.out.println("User enter title");
		OR.titleInput.click();
		OR.titleInput.sendKeys(title);
		
		System.out.println("User enter password");
		OR.passwordInputt.click();
		OR.passwordInputt.sendKeys(password);
		
		System.out.println("User agree with terms");
		OR.termsBox.click();
		
		System.out.println("User click on Create Account");
		OR.createAccountInput.click();

	}
	
	@AfterMethod
	private void waitBeforeClose() throws InterruptedException {
		
		Thread.sleep(5000);
	}
	
	@AfterTest
	private void quitDriver() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	

	
	
	
}
