package webDriverProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
       driver.get("http://www.google.com");
	}

}

