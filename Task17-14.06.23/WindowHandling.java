package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("home")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles);
		List<String> Mylist = new ArrayList<String>(WindowHandles);
		
		driver.switchTo().window(Mylist.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
		

	}

}
