package com.example.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillSubmitDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open form
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        // Handle cookie consent iframe if present
        try {
            driver.switchTo().frame("aswift_2");  // Google Ads iframe name may change
            driver.switchTo().frame("ad_iframe");
            driver.findElement(By.xpath("//div[text()='Accept']")).click();
            driver.switchTo().defaultContent();
            System.out.println("✅ Cookie consent handled.");
        } catch (Exception e) {
            System.out.println("ℹ️ No cookie consent popup found.");
            driver.switchTo().defaultContent();
        }

        // Fill First Name
        driver.findElement(By.name("firstname")).sendKeys("John");

        // Fill Last Name
        driver.findElement(By.name("lastname")).sendKeys("Doe");

        // Select Gender (Male)
        driver.findElement(By.id("sex-0")).click();

        // Select Years of Experience (e.g., 5)
        driver.findElement(By.id("exp-4")).click();

        // Select Profession checkbox (Automation Tester)
        driver.findElement(By.id("profession-1")).click();

        // Select Continent from dropdown (Europe)
        WebElement continentDropdown = driver.findElement(By.id("continents"));
        Select continentSelect = new Select(continentDropdown);
        continentSelect.selectByVisibleText("Europe");

        // Submit Form
        driver.findElement(By.id("submit")).click();

        // Wait a bit
        Thread.sleep(2000);

        // ✅ Validation (basic: check page reloaded)
        if (driver.getCurrentUrl().contains("selenium-practice-form")) {
            System.out.println(" Form submitted successfully!");
        } else {
            System.out.println(" Form submission failed!");
        }

        // Close browser
        driver.quit();
    }
}
