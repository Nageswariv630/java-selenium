package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelectorOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on Admin tab
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Locate search box in Admin tab using CSS Selector
        WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search']"));

        // Type "Admin" into search box
        searchBox.sendKeys("Admin");

        System.out.println("Typed 'Admin' into the search box successfully.");

        driver.quit();
    }
}
