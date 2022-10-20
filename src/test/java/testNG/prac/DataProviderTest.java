package testNG.prac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest{
	
	@Test(dataProvider ="getData")
	
	public void bookTicket(String src,String dest) {
		System.out.println(src +"------->"+dest );
	}
	@DataProvider
	public Object[][] getData(){
		
		Object arr[][]=new Object[3][2];
	   arr[0][0]="Blr";
	   arr[0][1]="Hyd";
	   
	   arr[1][0]="Del";
	   arr[1][1]="Bom";
	   
	   arr[2][0]="Blr";
	   arr[2][1]="Maa";
	   
		
		return arr;
		
	}

	

	//public static void main(String[] args) {
		
		//System.out.println( );
		
		
	
	

	}

