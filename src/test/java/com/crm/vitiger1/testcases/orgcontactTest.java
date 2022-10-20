package com.crm.vitiger1.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericutility.ExcelFileutility;
import genericutility.propertyfileutility;

public class orgcontactTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		propertyfileutility pFU = new propertyfileutility();
		String uRL = pFU.readDataFromPropertyFile("url");
		String uName = pFU.readDataFromPropertyFile("username");
		String pWD = pFU.readDataFromPropertyFile("password");

		// driver.get("http://localhost:8888/");
		driver.get(uRL);
		ExcelFileutility eFU = new ExcelFileutility();
		String orgName = eFU.readDataFromExcelFile("Sheet1", 3, 1);
		String fName = eFU.readDataFromExcelFile("Sheet1", 4, 1);
		String lName = eFU.readDataFromExcelFile("Sheet1", 5, 1);
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("admin");
		WebElement loginButton = driver.findElement(By.id("submitButton"));
		loginButton.click();
		WebElement conButton = driver.findElement(By.linkText("Contacts"));
		conButton.click();
		WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		plusButton.click();
		WebElement nameDD = driver.findElement(By.name("salutationtype"));
		Select select = new Select(nameDD);
		select.selectByValue(orgName);
		WebElement firstnameTf = driver.findElement(By.name("firstname"));
		firstnameTf.sendKeys(fName);
		WebElement lastnameTf = driver.findElement(By.name("lastname"));
		lastnameTf.sendKeys(lName);
		WebElement selectorg = driver.findElement(By.xpath("//img[@title='Select']"));
		selectorg.click();
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		Set<String> allwinHan = driver.getWindowHandles();
		
		for (String awindowhandles : allwinHan) {
			driver.switchTo().window(awindowhandles);
			System.out.println(awindowhandles);
		}
		WebElement orgSearchTf = driver.findElement(By.name("search_text"));
		orgSearchTf.sendKeys("manju1");
		WebElement searchButton = driver.findElement(By.name("search"));
		searchButton.click();
		WebElement SelectGGc = driver.findElement(By.linkText("manju1"));
		SelectGGc.click();
		driver.switchTo().window(parentwin);
		WebElement saveButton = driver.findElement(By.name("button"));
		saveButton.click();
		Thread.sleep(2000);
		WebElement adminImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action = new Actions(driver);
		action.moveToElement(adminImg).perform();

		WebElement signOut = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signOut.click();

		driver.close();
	}

}
