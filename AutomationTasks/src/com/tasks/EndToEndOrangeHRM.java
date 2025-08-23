package com.tasks;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndOrangeHRM {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Step 1: Open OrangeHRM
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // Step 2: Login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // Step 3: Navigate to PIM
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();

            // Step 4: Add Employee
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Employee']"))).click();

            // Generate unique employee name
            String uniqueId = UUID.randomUUID().toString().substring(0, 5);
            String firstName = "John" + uniqueId;
            String lastName = "Doe";

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys(firstName);
            driver.findElement(By.name("lastName")).sendKeys(lastName);

            // Save employee
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // Wait for "Personal Details" to confirm save
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
            System.out.println("Employee save confirmed");

            // Step 5: Verify employee in list
            driver.findElement(By.xpath("//a[text()='Employee List']")).click();

            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Type for hints...']")));
            searchBox.sendKeys(firstName + " " + lastName);

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Wait until employee row is visible
            WebElement employeeRow = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='oxd-table-body']//div[contains(text(),'" + firstName + "')]")));

            // Extract only employee full name from table (second column usually holds the name)
            WebElement employeeNameCell = employeeRow.findElement(By.xpath("./parent::div/following-sibling::div[1]"));
            System.out.println("Employee found in list: " + employeeNameCell.getText());

            // Step 6: Log out
            driver.findElement(By.cssSelector("p.oxd-userdropdown-name")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']"))).click();

            System.out.println("Logged out successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
