package webDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class DemoQA {
    public static void main(String[] args) {
        // Set up the WebDriver and launch the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the DemoQA Forms page
            driver.get("https://demoqa.com/automation-practice-form");

            // 1. Handle Input Boxes
            WebElement firstNameInput = driver.findElement(By.id("firstName"));
            firstNameInput.sendKeys("Ridham");
            Thread.sleep(2000); 

            WebElement lastNameInput = driver.findElement(By.id("lastName"));
            lastNameInput.sendKeys("Khazanchi");
            Thread.sleep(2000); 

            WebElement emailInput = driver.findElement(By.id("userEmail"));
            emailInput.sendKeys("ridham@example.com");
            Thread.sleep(2000); 

            // 2. Handle Radio Buttons (e.g., Gender)
            WebElement genderFemaleRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-2']/following-sibling::label"));
            genderFemaleRadioButton.click();
            Thread.sleep(2000); 
            
            // 3. Handle Mobile Number
            driver.findElement(By.id("userNumber")).sendKeys("9419194191");
            Thread.sleep(2000);

            // 4. Handle Date of Birth
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
            js.executeScript("arguments[0].click();", dateOfBirthInput);
            WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
            monthDropdown.click();
            WebElement octoberOption = driver.findElement(By.xpath("//option[text()='October']"));
            octoberOption.click();
            
            WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
            yearDropdown.click();
            WebElement yearOption = driver.findElement(By.xpath("//option[text()='2002']"));
            yearOption.click();

            WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='27']"));
            js.executeScript("arguments[0].click();", day);
            Thread.sleep(2000);

            // 5. Handle Subjects
            WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
            subjectsInput.sendKeys("Computer Science");
            subjectsInput.sendKeys(Keys.ENTER);
            Thread.sleep(2000);

            // 6. Handle Checkboxes (e.g., Hobbies - Sports)
            WebElement sportsCheckbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']/following-sibling::label"));
            sportsCheckbox.click();
            Thread.sleep(2000); 

            // 7. Upload Picture
            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\DELL\\OneDrive\\Pictures\\Camera Roll\\WIN_20240817_14_36_16_Pro.jpg");
            Thread.sleep(2000);

            // 8. Enter Current Address
            driver.findElement(By.id("currentAddress")).sendKeys("ABC, Gurugram, Haryana");
            Thread.sleep(2000);

            // 9. Handle State Dropdown
            WebElement state = driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("Haryana");
            state.sendKeys(Keys.ENTER);
            Thread.sleep(2000);

            // 10. Handle City Dropdown
            WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Panipat");
            city.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            
            // 11. Handle Submit Button
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();
            Thread.sleep(2000); 

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
