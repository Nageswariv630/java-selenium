package com.tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GoogleSearchResultsFirefox {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        try {
            WebElement consentButton = driver.findElement(By.xpath("//button[contains(text(),'Accept')]"));
            consentButton.click();
        } catch (Exception e) {}

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resultsStats = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result-stats"))
        );

        System.out.println("Search Results: " + resultsStats.getText());
        driver.quit();
    }
}
