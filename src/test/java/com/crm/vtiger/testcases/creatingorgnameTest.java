package com.crm.vtiger.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericutility.propertyfileutility;

public class creatingorgnameTest {

	
	 public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("http://localhost:8888/");

			WebElement username = driver.findElement(By.name("user_name"));
			username.sendKeys("admin");
			WebElement password = driver.findElement(By.name("user_password"));
			password.sendKeys("admin");
			WebElement loginButton = driver.findElement(By.id("submitButton"));
			loginButton.click();
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();

			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("ManjulAAA123w1e");
			driver.findElement(By.name("button")).click();

//		      Thread.sleep(3000);
			WebElement adminImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions action = new Actions(driver);
			action.moveToElement(adminImg).perform();
			WebElement signOut = driver.findElement(By.xpath("//a[text()='Sign Out']"));
			signOut.click();

			driver.close();

		}

	}
