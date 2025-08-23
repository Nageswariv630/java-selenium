package com.example.navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		System.out.println("Title: "+driver.getTitle());
		WebElement webEle = driver.findElement(By.xpath("/html/body/main/div/form/div"));
		webEle.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		System.out.println("Clicked Link");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("After Navigation: "+driver.getTitle());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();
		
	}
}
