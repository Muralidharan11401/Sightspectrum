package selenium;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AjaxCall {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"HTML34\"]/div[1]/div/button")).click();
		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	    WebElement facebookoption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		facebookoption.click();
		
		
		
		

	}

	
	}


