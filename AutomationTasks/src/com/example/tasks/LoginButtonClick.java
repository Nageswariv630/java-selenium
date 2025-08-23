package com.example.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonClick {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Step 1: Open OrangeHRM demo site
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // Step 2: Enter username & password
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("Admin");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");

            // Step 3: Click Login button
            WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
            loginBtn.click();

            // Step 4: Validate page title
            String expectedTitle = "OrangeHRM";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println(" Login successful! Page title is: " + actualTitle);
            } else {
                System.out.println(" Login failed! Expected: " + expectedTitle + " but got: " + actualTitle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
