package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(SrcFile, new File("C:\\Users\\SSLTP11251\\Desktop\\Selenium\\screen5.png"));
	
		driver.switchTo().alert().accept();

	}

}
