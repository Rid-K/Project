
package webDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
    public static void main(String[] args) {
        // Set up the WebDriver and launch the browser
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Wikipedia");
            Thread.sleep(2000); 
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).perform();  // Move to the first suggestion
            Thread.sleep(1000);
            actions.sendKeys(Keys.DOWN).perform();  // Move to the second suggestion
            Thread.sleep(1000);
            actions.sendKeys(Keys.RETURN).perform(); // Select the suggestion

            Thread.sleep(2000);
            System.out.println("Page Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}
