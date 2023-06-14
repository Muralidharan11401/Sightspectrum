package selenium;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.domsnapshot.model.DocumentSnapshot;

public class HiddenElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hide-textbox")).click();
		
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		j.executeScript
	      ("document.getElementById('displayed-text').value='Selenium';");
		String s = (String) j.executeScript("return document.getElementById('displayed-text').value");
	      System.out.print("Value entered in hidden field: " +s);
	      
	      driver.findElement(By.id("show-textbox")).click();
	      
	     // driver.close();

	}

}
