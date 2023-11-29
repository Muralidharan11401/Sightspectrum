package atstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample22 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11251\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://ats-test.vercel.app/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"TextField3\"]")).sendKeys("atstestingteam@sightspectrum.in");
		driver.findElement(By.xpath("//*[@id=\"TextField8\"]")).sendKeys("TESTINGTEAM#123");
		
		driver.findElement(By.xpath("//*[@id=\"id__13\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/div[7]/button/span/div/img")).click();
		
		
	}

}
