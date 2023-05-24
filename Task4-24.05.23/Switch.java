package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		String currentwindow = driver.getWindowHandle();
		
	      Set<String> tabs =  driver.getWindowHandles();
	        System.out.println(tabs);
	        Iterator<String> i = tabs.iterator();
	        while(i.hasNext()){
	            String childwindow = i.next();
	            if(!childwindow.equalsIgnoreCase(currentwindow)){
	                driver.switchTo().window(childwindow);
	                System.out.println("The child window is "+childwindow);
	            }
		
		
		
	}

}
}