package com.crm.vitiger2.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import genericutility.ExcelFileutility;
import genericutility.Javautility;
import genericutility.WebDriverUtility;
import genericutility.propertyfileutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class creatingorgnameTest {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wdu =new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		propertyfileutility pFU=new propertyfileutility();
		String uRL =pFU.readDataFromPropertyFile("url");
		String uName =pFU.readDataFromPropertyFile("username");
		String pWD =pFU.readDataFromPropertyFile("password");
		
		ExcelFileutility efu=new ExcelFileutility();
		String industryType =efu.readDataFromExcelFile("sheet1", 2, 1);
		
		driver.get(uRL);
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys(uName);
		WebElement password =driver.findElement(By.name("user_password"));
		password.sendKeys(pWD);
		WebElement loginButton=driver.findElement(By.id("submitButton"));
		loginButton.click();
		 
		 String orgname2="Testyantra1"+Javautility.generateRannum();
		 
		 WebElement orgclick  = driver.findElement(By.xpath("//a[text()='Organizations']"));
		 orgclick.click();
		 
		 WebElement createorgclick =driver.findElement(By.xpath("//img[@title='Create Organization...']"));
		 createorgclick.click();
		       
		 WebElement orgname=driver.findElement(By.name("accountname"));
		    orgname.sendKeys(orgname2);
		 //WebElement indnameDd =driver.findElement(By.name("industry"));
              //wdu.SelectByValue(indnameDd, indType);
		 Thread.sleep(3000);
		  WebElement savebutton=driver.findElement(By.name("button"));
		  savebutton.click();
		     
		     Thread.sleep(3000);
		     
	
	     WebElement adminImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	     wdu.mouseOverAction(adminImg);
//			 Actions action =new Actions(driver);
//			 action.moveToElement(adminImg).perform();
		 WebElement signOut=driver.findElement(By.xpath("//a[text()='Sign Out']"));
			 signOut.click();
			 
			  driver.close();

}


}


