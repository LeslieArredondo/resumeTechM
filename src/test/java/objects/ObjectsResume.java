package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class ObjectsResume {

	
	WebDriver driver;
	public ObjectsResume(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Log In Page
	
	public WebElement emailInput = driver.findElement(By.id("email"));
	
	public WebElement passwordInput = driver.findElement(By.id("password"));

	public WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));

	public WebElement CreateAnAccountButton = driver.findElement(By.xpath("//a[@href='/sign-up']"));
	
	//Create An Account Page
	
	public WebElement firstNameInput = driver.findElement(By.id("firstName"));
	
	public WebElement lastNameInput = driver.findElement(By.id("lastName"));

	public WebElement emailInputt = driver.findElement(By.id("email"));

	public WebElement titleInput = driver.findElement(By.id("title"));
	
	public WebElement passwordInputt = driver.findElement(By.id("password"));

	public WebElement termsBox = driver.findElement(By.xpath("//input[@name='terms']"));

	public WebElement createAccountInput = driver.findElement(By.xpath("//button[@type='submit']"));

	public WebElement haveAnAccountInput = driver.findElement(By.xpath("//a[@href='/log-in']"));

	
	
}
