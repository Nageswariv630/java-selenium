package com.example.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement textBox = driver.findElement(By.name("my-text"));

        textBox.sendKeys("java");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        String res = textBox.getAttribute("value");
        System.out.println("Response is : " + res);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       
        driver.quit();
	}

}