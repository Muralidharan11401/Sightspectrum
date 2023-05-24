package selenium;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Seleniumdemo {

	

	public static void main(String[] args) throws Throwable {

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		//Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("sight");
		driver.findElement(By.name("lastname")).sendKeys("spectrum");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("sightspecrum2006@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sightspecrum2006@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		
 
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Select select = new Select(day);
		select.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		Select select1 = new Select(month);
		select1.selectByIndex(5);
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		
		Select select2 = new Select(year);
		select2.selectByIndex(24);
		 Thread.sleep(1000);
		
		
		
		WebElement radio = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
		radio.click();
		
	
		
		Thread.sleep(1000);
		
		String strUrl = driver.getCurrentUrl();
		
		System.out.println(strUrl); 


		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(SrcFile, new File("C:\\Users\\SSLTP11251\\Desktop\\Selenium\\screen30.png"));
	
		driver.switchTo().alert().accept();
		
	}

}
