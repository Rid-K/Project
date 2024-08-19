package webDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Pom {

    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    Pom(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
    }          

    // Locators for form fields
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By genderFemale = By.xpath("//label[text()='Female']");
    By userNumber = By.id("userNumber");
    By dateOfBirthInput = By.id("dateOfBirthInput");
    By monthDropdown = By.className("react-datepicker__month-select");
    By yearDropdown = By.className("react-datepicker__year-select");
    By day = By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='27']");
    By subjectsInput = By.id("subjectsInput");
    By musicCheckbox = By.xpath("//label[text()='Music']");
    By uploadPicture = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By state = By.id("react-select-3-input");
    By city = By.id("react-select-4-input");
    By submitButton = By.id("submit");

    // Methods to interact with the form fields
    public void setFirstName(String fname) throws InterruptedException {
        driver.findElement(firstName).sendKeys(fname);
        Thread.sleep(3000); 
    }

    public void setLastName(String lname) throws InterruptedException {
        driver.findElement(lastName).sendKeys(lname);
        Thread.sleep(3000); 
    }

    public void setEmail(String email) throws InterruptedException {
        driver.findElement(userEmail).sendKeys(email);
        Thread.sleep(3000); 
    }

    public void selectGender() throws InterruptedException {
        js.executeScript("arguments[0].click();", driver.findElement(genderFemale)); // Click on Female
        Thread.sleep(3000); 
    }

    public void setUserNumber(String number) throws InterruptedException {
        driver.findElement(userNumber).sendKeys(number);
        Thread.sleep(3000);
    }

    public void setDateOfBirth(String month, String year, String dayText) {
        js.executeScript("arguments[0].click();", driver.findElement(dateOfBirthInput));
        new Select(driver.findElement(monthDropdown)).selectByVisibleText(month);
        new Select(driver.findElement(yearDropdown)).selectByVisibleText(year);
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + dayText + "']")));
    }

    public void setSubjects(String subject) throws InterruptedException {
        WebElement subjects = driver.findElement(subjectsInput);
        subjects.sendKeys(subject);
        subjects.sendKeys(Keys.ENTER);
        Thread.sleep(3000); 
    }

    public void selectHobbies() throws InterruptedException {
        js.executeScript("arguments[0].click();", driver.findElement(musicCheckbox));
        Thread.sleep(3000); 
    }

    public void uploadPicture(String filePath) throws InterruptedException {
        driver.findElement(uploadPicture).sendKeys(filePath);
        Thread.sleep(3000);
    }

    public void setAddress(String address) throws InterruptedException {
        driver.findElement(currentAddress).sendKeys(address);
        Thread.sleep(3000); 
    }

    public void selectState(String stateName) {
        WebElement stateElement = driver.findElement(state);
        stateElement.sendKeys(stateName);
        stateElement.sendKeys(Keys.ENTER);
    }

    public void selectCity(String cityName) {
        WebElement cityElement = driver.findElement(city);
        cityElement.sendKeys(cityName);
    	cityElement.sendKeys(Keys.ENTER);
    }

    public void submitForm() throws InterruptedException {
        js.executeScript("arguments[0].click();", driver.findElement(submitButton));
        Thread.sleep(5000); 
    }

    public static void main(String[] args) {
        // Set up the WebDriver for Chrome
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the DemoQA practice form page
            driver.get("https://demoqa.com/automation-practice-form");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Create an instance of the Pom class
            Pom formPage = new Pom(driver);

            // Interact with the form using methods from the Pom class
            formPage.setFirstName("Ridham");
            formPage.setLastName("Khazanchi");
            formPage.setEmail("ridham@gmail.com");
            formPage.selectGender();
            formPage.setUserNumber("9419194191");
            formPage.setDateOfBirth("October", "2002", "27");
            formPage.setSubjects("Computer Science");
            formPage.selectHobbies();
            formPage.uploadPicture("C:\\Users\\DELL\\OneDrive\\Pictures\\Camera Roll\\WIN_20240817_14_36_16_Pro.jpg");
            formPage.setAddress("ABC, Gurugram, Haryana");
            formPage.selectState("Haryana");
            formPage.selectCity("Panipat");
            formPage.submitForm();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
