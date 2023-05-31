package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		
	    WebElement facebookoption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		facebookoption.click();	

	}

}
