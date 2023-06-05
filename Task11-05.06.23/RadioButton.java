package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"ui-page-top\"]/div[1]/div[3]/div[1]/form/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-page-top\"]/div[1]/div[3]/div[5]/form/fieldset/div[2]/div[3]/label")).click();

	}

}
