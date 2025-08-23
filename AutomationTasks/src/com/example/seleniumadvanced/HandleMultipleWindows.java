package com.example.seleniumadvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
    public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to site
        driver.get("https://the-internet.herokuapp.com/windows");

        // Store parent window ID
        String parentWindow = driver.getWindowHandle();

        // ---------------- Task 1: Click → Switch to New Tab ----------------
        driver.findElement(By.linkText("Click Here")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        for (String win : allWindows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win); // switch to child
                System.out.println("Child Window Title: " + driver.getTitle());
            }
        }

        // ---------------- Task 2: Close child window → back to parent ----------------
        driver.close(); // closes current (child) window
        driver.switchTo().window(parentWindow); // switch back

        // ---------------- Task 3: Verify parent page text ----------------
        String pageText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Parent Page Text: " + pageText);

        if (pageText.contains("Opening a new window")) {
            System.out.println(" Parent page is still visible!");
        } else {
            System.out.println(" Something went wrong!");
        }

        driver.quit();
    }
}

