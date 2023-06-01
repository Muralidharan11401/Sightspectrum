package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTypes {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//FullScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SSLTP11251\\Desktop\\Selenium\\fullsrc.png");
		FileHandler.copy(SrcFile, dest);
		
		//Eelementscreenshot
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		File src= ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\SSLTP11251\\Desktop\\Selenium\\elesrc.png");
		FileHandler.copy(src, dest1);
		
		//Specificareascreenshot
		WebElement info = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]"));
		File info2= info.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\SSLTP11251\\Desktop\\Selenium\\spcsrc.png");
		FileHandler.copy(info2, dest2);		

	}

}
