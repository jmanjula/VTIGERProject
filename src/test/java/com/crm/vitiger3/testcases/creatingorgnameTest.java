package com.crm.vitiger3.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.ExcelFileutility;
import genericutility.Javautility;
import genericutility.WebDriverUtility;
import objectRepository.HomePageClass;
import objectRepository.NewOrgPageClass;
import objectRepository.orgPageClass;
import testNG.prac.ListImpClass;

@Listeners(ListImpClass.class)
public class creatingorgnameTest extends Baseclass {

	@Test(groups = "smoke")

	public void creatingorgnameTestNG() throws Throwable {

		WebDriverUtility webDriUtility = new WebDriverUtility(driver);

		ExcelFileutility efu = new ExcelFileutility();
		String industryType = efu.readDataFromExcelFile("sheet1", 2, 1);
		String orgname2 = "Testyantra1" + Javautility.generateRannum();
		HomePageClass hpc = new HomePageClass(driver);
		hpc.getOrgButton().click();
		orgPageClass opc = new orgPageClass(driver);
		opc.getcreorg().click();
		NewOrgPageClass npc = new NewOrgPageClass(driver);
		npc.orgTF(orgname2);

		npc.getSaveButton().click();

	}

}

