package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClassNameOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Enter username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        // Locate Login button by its class name and click
        WebElement loginBtn = driver.findElement(By.className("orangehrm-login-button"));
        loginBtn.click();

        // (Optional) Print page title after login
        System.out.println("Page title after login: " + driver.getTitle());

        driver.quit();
    }
}

