package webDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Pom {

    private WebDriver driver;
    private PomTest formsPage;

    @BeforeClass
    public void setUp() {
        System.out.println("Demo QA form(POM)");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        formsPage = new PomTest(driver);
    }

    @Test
    public void testFormSubmission() throws InterruptedException {
    	formsPage.setFirstName("Ridham");
    	formsPage.setLastName("Khazanchi");
    	formsPage.setEmail("ridham@gmail.com");
    	formsPage.selectGender();
    	formsPage.setUserNumber("9419194191");
    	formsPage.setDateOfBirth("October", "2002", "27");
    	formsPage.setSubjects("Science");
    	formsPage.selectHobbies();
    	formsPage.uploadPicture("C:\\Users\\DELL\\OneDrive\\Pictures\\Camera Roll\\WIN_20240817_14_36_16_Pro.jpg");
    	formsPage.setAddress("ABC, Gurugram, Haryana");
    	formsPage.selectState("Haryana");
    	formsPage.selectCity("Panipat");
    	formsPage.submitForm();
		Thread.sleep(7000);
    }
    

    @AfterClass
    public void tearDown() {
           driver.quit();
    }
}






