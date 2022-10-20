package com.crm.vitiger2.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericutility.ExcelFileutility;
import genericutility.Javautility;
import genericutility.WebDriverUtility;
import genericutility.propertyfileutility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrgnamevalidationWDTest {

	

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
		String indType =efu.readDataFromExcelFile("sheet1", 1, 2);
		
		driver.get(uRL);
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys(uName);
		WebElement password =driver.findElement(By.name("user_password"));
		password.sendKeys(pWD);
		WebElement loginButton=driver.findElement(By.id("submitButton"));
		 loginButton.click();
		  
		String orgname1="Testyantra1"+Javautility.generateRannum();
    WebElement orgclick  = driver.findElement(By.xpath("//a[text()='Organizations']"));
      orgclick.click();
    WebElement createorgclick =driver.findElement(By.xpath("//img[@title='Create Organization...']"));
     createorgclick.click();
       
      WebElement orgname=driver.findElement(By.name("accountname"));
      orgname.sendKeys(orgname1);
     WebElement indnameDd =driver.findElement(By.name("industry"));
     wdu.SelectByValue(indnameDd, indType);
     WebElement savebutton=driver.findElement(By.name("button"));
     savebutton.click();
     Thread.sleep(3000);
    // WebElement orgname2=driver.findElement(By.xpath("//a[text()='TestYantra']"));
  //   orgname2.click();
     String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();
     if(orgnametext.contains(orgname1))
     {
    	System.out.println("validation succesfull") ;
     }
     else
     {
    	 System.out.println("validation failed");
     }
 
     WebElement adminImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
     wdu.mouseOverAction(adminImg);
     WebElement signOut=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	 signOut.click();
	 
	  driver.close();

   

			 

	}


	}


