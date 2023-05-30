package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("sightspectrum");
		WebElement alpha = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(alpha);
		driver.findElement(By.name("email")).sendKeys("sightspectrum.com");
	}

}
