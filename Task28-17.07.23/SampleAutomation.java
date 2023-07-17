package selenium;

import org.asynchttpclient.netty.request.NettyRequestSender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.meesho.com/auth?redirect=https%3A%2F%2Fwww.meesho.com%2F&source=profile&entry=header&screen=HP");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("MuraliDharan");
		
		driver.findElement(By.id("customer.address.street")).sendKeys("Vadalur");
		
		driver.findElement(By.id("customer.lastName")).sendKeys("S");
		
		driver.findElement(By.id("customer.address.city")).sendKeys("Cuddalore");
		
		driver.findElement(By.id("customer.address.state")).sendKeys("Tamilnadu");
		
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("607303");
		
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
		
		driver.findElement(By.id("customer.ssn")).sendKeys("12345679");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("customer.username")).sendKeys("Sightpectrum6");
		
		driver.findElement(By.id("customer.password")).sendKeys("Sightspectrum1@");
		
		driver.findElement(By.id("repeatedPassword")).sendKeys("Sightspectrum1@");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[8]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Sightpectrum6");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Sightspectrum1@");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		
		driver.findElement(By.id("amount")).sendKeys("1500");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input")).click();
		
		//driver.
		
	}

}
