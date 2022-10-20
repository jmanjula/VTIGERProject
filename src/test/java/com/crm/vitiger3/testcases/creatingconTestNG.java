package com.crm.vitiger3.testcases;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.ExcelFileutility;

import genericutility.WebDriverUtility;

import objectRepository.ConPageClass;
import objectRepository.HomePageClass;

import objectRepository.NewConPageClass;
import testNG.prac.ListImpClass;
@Listeners(ListImpClass.class)
public class creatingconTestNG extends Baseclass {
	
	
	@Test(groups="integration")
	public void creatingConTestNg() throws Throwable
	{
		WebDriverUtility webDriUtility = new WebDriverUtility(driver);
		
		ExcelFileutility efu=new ExcelFileutility();
		String FistDD =efu.readDataFromExcelFile("Sheet1", 3, 1);
		String FName =efu.readDataFromExcelFile("Sheet1", 4, 1);
		String LName =efu.readDataFromExcelFile("Sheet1", 5, 1);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Manju\\automation\\sdet\\Path\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		HomePageClass hpc=new HomePageClass(driver);
	     hpc.getConButton().click();
	    // ConPageClass cpc=new ConPageClass(driver);
	     ConPageClass cpc=new ConPageClass(driver);
	     cpc.getCrecon().click();
	     
	     NewConPageClass cpc1=new NewConPageClass(driver);
	    cpc1.firstNameType(FistDD);
	    cpc1.firstName(FName);
	    cpc1.lastName(LName);
	    cpc1.getselorg().click();
	    String parentwin =webDriUtility.switchToParent();
		webDriUtility.allHandles(parentwin);
		System.out.println(parentwin);
		 Set<String> allwinHan =driver .getWindowHandles();
		 for(String awindowhandles:allwinHan) {
			 driver.switchTo().window(awindowhandles);
			 System.out.println(awindowhandles);
		 }
		
		WebElement searchTF=driver.findElement(By.id("search_txt"));
		searchTF.sendKeys("manju");
		WebElement searchButton=driver.findElement(By.name("search"));
		searchButton.click();
		Thread.sleep(3000);
		WebElement selectOrg =driver.findElement(By.id("1"));
		selectOrg.click();
		Thread.sleep(3000);
		webDriUtility.allHandles(parentwin);
		cpc1.getsButton().click();
		Thread.sleep(3000);
       
	    
			}

}


