package webDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examplee {
  public static void main(String args[]) {
	  try {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	      
			 driver.get("https://example.com/");
			 WebElement link = driver.findElement(By.linkText("More information..."));
	         link.click();
	         Thread.sleep(2000);
	        
	         link = driver.findElement(By.linkText("Domains"));
	         link.click();
	         Thread.sleep(2000);
	         
	         link = driver.findElement(By.linkText(".ARPA Registry"));
	         link.click();
	         Thread.sleep(2000);
	         
	         link = driver.findElement(By.linkText("Protocols"));
	         link.click();
	         Thread.sleep(2000);
	         
	         link = driver.findElement(By.linkText("Performance"));
	         link.click();
	         Thread.sleep(2000); 
	         
	         
	         link = driver.findElement(By.linkText("Numbers"));
	         link.click();
	         Thread.sleep(2000);
	         
	         link = driver.findElement(By.linkText("IPv6 (AFRINIC)"));
	         link.click();
	         Thread.sleep(2000); 
	         
	         
	         link = driver.findElement(By.linkText("About"));
	         link.click();
	         Thread.sleep(2000);
	        
	         link = driver.findElement(By.linkText("Performance Reporting"));
	         link.click();
	         Thread.sleep(2000);
	         
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	 
  }
}
