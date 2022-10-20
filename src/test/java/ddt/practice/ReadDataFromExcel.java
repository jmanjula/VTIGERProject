package ddt.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

   

public class ReadDataFromExcel {


	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\selenium-server-4.3.0\\path\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("sheet1");
		Row ro=sh.getRow(0);
	   Cell ce=ro.getCell(0);
	   String Data=ce.getStringCellValue();
		System.out.println(Data);
		
		// TODO Auto-generated method stub

	}

}
