package com.crm.vitiger1.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericutility.ExcelFileutility;
import genericutility.Javautility;
import genericutility.propertyfileutility;

public class orgnamevalidationTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		propertyfileutility pFU = new propertyfileutility();
		String uRL = pFU.readDataFromPropertyFile("url");
		String uName = pFU.readDataFromPropertyFile("username");
		String pWD = pFU.readDataFromPropertyFile("password");
		// ExcelFileutility eFU=new ExcelFileutility();
		// String orggName=
		// eFU.readDataFromExcelFile("Sheet1",2,2)+Javautility.generateRannum();

		driver.get(uRL);
		// driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.manage().window().maximize();

		String OrgName = "Testyantra Organisation02";

		WebElement orgButton = driver.findElement(By.xpath(("(//a[text()='Organizations'])[1]")));
		orgButton.click();

		WebElement newOrg = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		newOrg.click();

		WebElement orgNameTF = driver.findElement(By.name("accountname"));
		orgNameTF.sendKeys(OrgName);
		WebElement indDD = driver.findElement(By.name("industry"));

		Select select = new Select(indDD);
		select.selectByValue("Biotechnology");

		WebElement saveButton = driver.findElement(By.name("button"));
		saveButton.click();

		if (OrgName.contains(OrgName)) {
			System.out.println("validation successful");
		} else {
			System.out.println("validation not successful");
		}

		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();

	}

}
