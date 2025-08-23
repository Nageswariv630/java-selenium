package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver(); //open chrome
		driver.get("https://www.demoblaze.com/#");  //navigate to website
		driver.manage().window().maximize();   //to maximize the window
		//to find contact by using xpath and open form
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]")).click(); 
		Thread.sleep(2000);  //to load the contacts form
		//for useremail
		// by using xpath  to find useremail input field
		WebElement useremail=driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
		useremail.sendKeys("nageswariv630@gmail.com"); //to enter  useremail in input field
		System.out.println("useremail : "+useremail.getAttribute("value")); //to print the entered email value 
		//for username
		WebElement username=driver.findElement(By.xpath("//*[@id=\"recipient-name\"]"));// by using xpath to find username input field
		username.sendKeys("Nageswari"); //to enter  username in input field
		System.out.println("useranme : "+username.getAttribute("value"));//to print the entered name value 
		//for usermessage
		WebElement usermessage=driver.findElement(By.xpath("//*[@id=\"message-text\"]"));// by using xpath to find usermessage input field
		usermessage.sendKeys("hi"); //to enter  usermessage in input field
		System.out.println("usermessage : "+usermessage.getAttribute("value"));//to print the entered message value 
		// Change the contact email to "acvdf@gmail.com"
        useremail.clear();
        useremail.sendKeys("acvdf@gmail.com");
        System.out.println("updated email : "+useremail.getAttribute("value"));
        driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")); //to find send message button
        driver.quit();
	}

}
