package com.tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPathOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Login first
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // --- Locate Admin menu by ABSOLUTE XPath ---
        WebElement adminMenuAbs = driver.findElement(By.xpath("/html/body/div/div/div/aside/nav/div[2]/ul/li[1]/a"));
        adminMenuAbs.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // --- Locate Admin menu by RELATIVE XPath ---
        WebElement adminMenuRel = driver.findElement(By.xpath("//span[text()='Admin']"));
        adminMenuRel.click();

        driver.quit();
    }
}

