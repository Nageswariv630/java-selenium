package com.example.tasks;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTextFieldEntry {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Step 1: Open W3Schools form page
            driver.get("https://www.w3schools.com/html/html_forms.asp");
            driver.manage().window().maximize();

            // Step 2: Enter First Name
            WebElement firstName = driver.findElement(By.id("fname"));
            firstName.clear();
            firstName.sendKeys("John");

            // Step 3: Enter Last Name
            WebElement lastName = driver.findElement(By.id("lname"));
            lastName.clear();
            lastName.sendKeys("Doe");

            // Step 4: Click Submit button
            WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
            submitBtn.click();

            // Step 5: Validate entered data on new page
            String pageSource = driver.getPageSource();

            if (pageSource.contains("John") && pageSource.contains("Doe")) {
                System.out.println(" Test Passed! Entered data is displayed on the new page.");
            } else {
                System.out.println(" Test Failed! Data not found on new page.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
