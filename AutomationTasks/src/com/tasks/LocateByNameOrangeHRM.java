package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Locate username by name
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Locate password by name
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Locate and click Login button
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        // (Optional) Print current URL to confirm login
        System.out.println("Logged in, current page: " + driver.getCurrentUrl());

        driver.quit();
    }
}
