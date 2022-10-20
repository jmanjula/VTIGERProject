package com.crm.vitiger3.testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.ExcelFileutility;
import genericutility.Javautility;
import objectRepository.HomePageClass;
import objectRepository.NewOrgInfoPageClass;
import objectRepository.NewOrgPageClass;
import objectRepository.orgPageClass;
import testNG.prac.ListImpClass;

@Listeners(ListImpClass.class)
public class Orgnamevalidation extends Baseclass {

	@Test

	public void orgnameTestNG() throws Throwable {

		ExcelFileutility efu = new ExcelFileutility();
		String indType = efu.readDataFromExcelFile("sheet1", 1, 2);
		String orgname2 = "Testyantra1" + Javautility.generateRannum();
		HomePageClass hpc = new HomePageClass(driver);
		hpc.getOrgButton().click();
		orgPageClass opc = new orgPageClass(driver);
		opc.getcreorg().click();
		NewOrgPageClass npc = new NewOrgPageClass(driver);
		npc.orgTF(orgname2);
		System.out.println("orgname2");
		NewOrgInfoPageClass nopc = new NewOrgInfoPageClass(driver);
		nopc.industrydd(indType);

		nopc.getSaveButton();
		Thread.sleep(3000);

		NewOrgPageClass nopc1 = new NewOrgPageClass(driver);
		nopc1.getSaveButton().click();
		NewOrgInfoPageClass noipc = new NewOrgInfoPageClass(driver);
		Assert.assertEquals(orgname2, noipc.hText1());

	}

}
