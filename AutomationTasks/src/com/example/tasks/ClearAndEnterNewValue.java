package com.example.tasks;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearAndEnterNewValue {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Step 1: Open W3Schools form page
            driver.get("https://www.w3schools.com/html/html_forms.asp");
            driver.manage().window().maximize();

            // Step 2: Enter and then clear First Name
            WebElement firstName = driver.findElement(By.id("fname"));
            firstName.sendKeys("WrongName");   // initial value
            Thread.sleep(1000);                // just for demo effect
            firstName.clear();
            firstName.sendKeys("Alice");       // correct value

            // Step 3: Enter and then clear Last Name
            WebElement lastName = driver.findElement(By.id("lname"));
            lastName.sendKeys("WrongLast");    // initial value
            Thread.sleep(1000);
            lastName.clear();
            lastName.sendKeys("Wonder");       // correct value

            // Step 4: Click Submit button
            WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
            submitBtn.click();

            // Step 5: Validate submitted data
            String pageSource = driver.getPageSource();

            if (pageSource.contains("Alice") && pageSource.contains("Wonder") &&
                !pageSource.contains("WrongName") && !pageSource.contains("WrongLast")) {
                System.out.println("Test Passed! Correct values submitted: Alice Wonder");
            } else {
                System.out.println("Test Failed! Incorrect values found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
