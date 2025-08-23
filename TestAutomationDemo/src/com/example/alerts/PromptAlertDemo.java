package com.example.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlertDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        ele.click();
        //explicit wait
        WebDriverWait web_driver=new WebDriverWait(driver, Duration.ofSeconds(6));
        web_driver.until(ExpectedConditions.alertIsPresent());
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        Alert alrt=driver.switchTo().alert();
       // System.out.println(alrt.getText());
        alrt.sendKeys("selenium");
        alrt.accept();
		
	}

}
