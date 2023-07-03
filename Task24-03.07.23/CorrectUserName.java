package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class CorrectUserName {

	public void loginWithCorrectUsername() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11251\\Desktop\\Selenium\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	WebElement userName = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	userName.sendKeys("Admin");
	//Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	password.sendKeys("pass");
//	Thread.sleep(2000);
	
	WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	loginButton.click();
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	}
	
	
}
