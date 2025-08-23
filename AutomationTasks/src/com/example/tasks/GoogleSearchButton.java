package com.example.tasks;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchButton {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Step 1: Open Google
            driver.get("https://www.google.com");
            driver.manage().window().maximize();

            // Step 2: Enter "Selenium WebDriver" in search box
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");

            // Step 3: Click Google Search button
            WebElement searchBtn = driver.findElement(By.name("btnK"));
            searchBtn.click();

            // Step 4: Validate search results contain "Selenium"
            String pageSource = driver.getPageSource();

            if (pageSource.contains("Selenium")) {
                System.out.println(" Test Passed! Search results contain 'Selenium'");
            } else {
                System.out.println(" Test Failed! 'Selenium' not found in results.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
