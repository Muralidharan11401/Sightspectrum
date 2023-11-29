package atstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BDEDashboard {

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
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div/div[1]/div[2]/button/span/div/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div[4]/div/div/div[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div/div[1]/i")).click();
		
		

	}

}
