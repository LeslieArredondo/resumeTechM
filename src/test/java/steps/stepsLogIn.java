package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.ObjectsResume;

public class stepsLogIn {

		ObjectsResume OR;
		public String URL = "https://resume.techmcne.com/log-in";
		String driverPath = "src/main/resources/drivers/chromedriver";
		public WebDriver driver;

		String email = "LA00833807@TECHMAHINDRA.COM";
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

		System.out.println("User enter the email");
		OR.emailInput.click();
		OR.emailInput.sendKeys(email);
		
		System.out.println("User enter the password");
		OR.passwordInput.click();
		OR.passwordInput.sendKeys(password);
		
		System.out.println("User click on Login");
		OR.logInButton.click();
	
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
