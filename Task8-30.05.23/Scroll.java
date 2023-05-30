package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jre = (JavascriptExecutor)driver;
		
		jre.executeScript("window.scroll(0,1000)");
		
		Thread.sleep(2000);
		
		jre.executeScript("window.scroll(0,-1000)");
		
		Thread.sleep(2000);
		
		jre.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//div[text()=' POPULAR SEARCHES ']"));
		jre.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		Thread.sleep(2000);
		jre.executeScript("window.scroll(0,0)");		
		
		
			
		
		
	}

}
