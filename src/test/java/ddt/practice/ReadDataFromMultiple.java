package ddt.practice;

import java.io.FileInputStream;
//import java.io.IOException;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromMultiple {

	public static void main(String[] args) throws Throwable {
		DataFormatter df=new  DataFormatter();
		FileInputStream fis = new FileInputStream("./emplist.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("sheet1");
		int lastRow=sh.getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{
			String data= df.formatCellValue(sh.getRow(i).getCell(1));
			System.out.println(data);
			
		}
		for (int i = 1; i <= lastRow; i++) {
			String name = sh.getRow(i). getCell(2).getStringCellValue();
			System.out.println(name);
		}
			
			
		
		for (int i = 1; i <= lastRow; i++) {
			int sal =(int) sh.getRow(i).getCell(2).getNumericCellValue();
			if(sal>35000);
			
			
			{
		String name=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(name);
			}
		}
	}
   }
 


	
		
				

	



