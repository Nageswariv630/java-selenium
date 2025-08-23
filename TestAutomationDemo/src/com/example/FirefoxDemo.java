package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			//name="q"
			WebElement serachBox=driver.findElement(By.name("q"));
			serachBox.sendKeys("cheese!!!");
			serachBox.submit();
			Thread.sleep(5000);
			String pageTitle=driver.getTitle();
			System.out.println("Page Title after search: "+pageTitle);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}finally {
			driver.quit();
		}
	}
}
