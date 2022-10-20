package com.crm.vitiger2.testcases.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import genericutility.ExcelFileutility;
import genericutility.Javautility;
import genericutility.WebDriverUtility;
import genericutility.propertyfileutility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePageClass;
import objectRepository.LoginPageClass;
import objectRepository.NewOrgInfoPageClass;
import objectRepository.NewOrgPageClass;
import objectRepository.orgPageClass;


public class OrgnamevalidationWDTest {

	

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wdu = new WebDriverUtility(driver);
		wdu.maximize();
		wdu.implicitlyWait();
		propertyfileutility pFU = new propertyfileutility();
		String uRL = pFU.readDataFromPropertyFile("url");
		String uName = pFU.readDataFromPropertyFile("username");
		String pWD = pFU.readDataFromPropertyFile("password");

		ExcelFileutility efu = new ExcelFileutility();
		String indType = efu.readDataFromExcelFile("sheet1", 1, 2);

		driver.get(uRL);
		LoginPageClass lpc = new LoginPageClass(driver);
		lpc.login(uName, pWD);

		String orgname2 = "Testyantra1" + Javautility.generateRannum();
		HomePageClass hpc = new HomePageClass(driver);
		hpc.getOrgButton().click();
		orgPageClass opc = new orgPageClass(driver);
		opc.getcreorg().click();
		NewOrgPageClass npc = new NewOrgPageClass(driver);
		npc.orgTF(orgname2);
		NewOrgInfoPageClass nopc = new NewOrgInfoPageClass(driver);
		nopc.industrydd(indType);
		nopc.getSaveButton();

		Thread.sleep(3000);
		NewOrgPageClass nopc1 = new NewOrgPageClass(driver);
		nopc1.getSaveButton().click();
		Thread.sleep(3000);

		NewOrgInfoPageClass noipc = new NewOrgInfoPageClass(driver);
		if (noipc.hText1().contains(orgname2)) {
			System.out.println("Validation successfull");
		} else {
			System.out.println("Not Valid");

		}
		Thread.sleep(3000);

		hpc.SignOut(driver);
		driver.close();

	}

}

