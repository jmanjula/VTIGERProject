package testNG.prac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericutility.ExcelFileutility;

public class DataProviderUsingExcel {


	@Test(dataProvider="exceldata")
	public void getdata(String un,String pwd) {
		System.out.println(un +" "+pwd);

	}


//	@Test
//	public void getdata() throws Throwable {
//		ExcelFileutility efu =new ExcelFileutility();
//		int lastrow= efu.getLastRowcount("Sheet2");
//		System.out.println(lastrow);
//	}


	@DataProvider
	public Object[][] exceldata() throws Throwable{
		ExcelFileutility efu =new ExcelFileutility();
		int lastrow= efu.getLastRowcount("Sheet2");
		
		Object arr[][]=new Object[lastrow+1][2];

		for(int i=0;i<=lastrow;i++) {

			arr[i][0] =efu.readDataFromExcelFile("Sheet2", i, 0);

			arr[i][1] =efu.readDataFromExcelFile("Sheet2", i, 1);

		}
		return arr;


	}

}
