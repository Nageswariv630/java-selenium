package com.example.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPrintAllOptionsDemo {
    public static void main(String[] args) {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        // Locate the dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//select"));
        Select select = new Select(countryDropdown);

        // Get all options
        List<WebElement> allOptions = select.getOptions();

        System.out.println("Total countries in dropdown: " + allOptions.size());

        // Print each country name
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Validation
        if (allOptions.size() > 0) {
            System.out.println(" Dropdown options printed successfully.");
        } else {
            System.out.println(" No options found in dropdown.");
        }

        // Close browser
        driver.quit();
    }
}

