package com.tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagNameOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Login first
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();

        // Wait for dashboard to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Find all hyperlinks on the dashboard using tag name "a"
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("Total hyperlinks on Dashboard: " + allLinks.size());

        // Print link text + href
        for (WebElement link : allLinks) {
            System.out.println("Text: " + link.getText() + " | URL: " + link.getAttribute("href"));
        }

        driver.quit();
    }
}

