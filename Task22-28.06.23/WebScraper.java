package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebScraper {

    public static void main(String[] args) throws InterruptedException {
        
       
        
       

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OpenWeatherMap website
        driver.get("https://openweathermap.org");
        
        Thread.sleep(2000);

        // Accept cookies if the dialog is present
        WebElement acceptCookiesButton = driver.findElement(By.cssSelector(".call-to-action"));
        acceptCookiesButton.click();

        // Search for a city
        WebElement searchInput = driver.findElement(By.id("q"));
        searchInput.sendKeys("New York");
        searchInput.submit();

        // Wait for the weather details to load
        try {
            Thread.sleep(2000); // Adjust the wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Extract the weather details
        WebElement temperatureElement = driver.findElement(By.cssSelector(".temperature .value"));
        String temperature = temperatureElement.getText();

        WebElement weatherDescriptionElement = driver.findElement(By.cssSelector(".weather-description"));
        String weatherDescription = weatherDescriptionElement.getText();

        // Print the extracted weather details
        System.out.println("Temperature: " + temperature);
        System.out.println("Weather Description: " + weatherDescription);

        // Close the browser
        driver.quit();
    }
}

