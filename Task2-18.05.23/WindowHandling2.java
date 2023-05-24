package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/chromebook/answer/177891?hl=en");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[1]/div/div/div/div[2]/div/span/a/span")).click();
		
		Set<String> WindowHandles = driver.getWindowHandles();
		List<String> Mylist = new ArrayList<String>(WindowHandles);
		
		driver.switchTo().window(Mylist.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/div[2]/div/a[2]")).click();
		
	}

}
