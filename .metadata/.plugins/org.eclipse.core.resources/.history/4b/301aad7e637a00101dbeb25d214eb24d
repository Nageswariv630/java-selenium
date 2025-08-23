package com.example.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectByIndexValueDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        // Locate the dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//select"));
        Select select = new Select(countryDropdown);

        // ---- Select by Index (5th option -> index = 4) ----
        select.selectByIndex(4);
        String selectedByIndex = select.getFirstSelectedOption().getText();
        System.out.println("Selected by Index (4): " + selectedByIndex);

        // Validation
        if (!selectedByIndex.isEmpty()) {
            System.out.println("Index selection successful.");
        } else {
            System.out.println("Index selection failed.");
        }

        Thread.sleep(2000);

        // ---- Select by Value (USA) ----
        select.selectByValue("USA");
        String selectedByValue = select.getFirstSelectedOption().getText();
        System.out.println("Selected by Value (USA): " + selectedByValue);

        // Validation
        if (selectedByValue.equals("United States")) {
            System.out.println("Value selection successful.");
        } else {
            System.out.println("Value selection failed. Current: " + selectedByValue);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
