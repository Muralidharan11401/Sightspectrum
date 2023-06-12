package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sightspectrum.com/");
		
		driver.manage().window().maximize();
		
		String myTitle = driver.getTitle();
		
		System.out.println("Title is : "+myTitle);
		
		String expextedTitle = "Data Analytics Consulting Services | IT Consulting Services";
		
		Assert.assertEquals(myTitle, expextedTitle);
		
		System.out.println("My Title is same as Expected Title!!!");		
		
		
driver.quit();
		

	}

}
