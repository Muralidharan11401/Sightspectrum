package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div[2]/form/button/span[2]")).click();
		
		Thread.sleep(2000);
		File filelocation = new File("C:\\Users\\SSLTP11251\\Downloads");
		File[] TotalFiles = filelocation.listFiles();
		
		for (File file : TotalFiles) {
			
			if(file.getName().equals("TestLeaf Logo.png"));
	
			{
				System.out.println("File is downloaded");
				break;
			}
			
		}
		
	}

}
