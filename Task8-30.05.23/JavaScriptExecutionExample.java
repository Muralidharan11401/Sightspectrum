package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
        String pageTitle = (String) jsExecutor.executeScript("return document.title;");
        System.out.println("Page Title: " + pageTitle);
        
      


       
        driver.quit();
        
        

	}

}
