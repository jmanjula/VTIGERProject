package genericutility;

import java.io.FileInputStream;
//import java.io.FileInputStream;
//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileutility {
	public String readDataFromExcelFile(String sheetNum,int rowNum,int cellNum) throws Throwable{
		FileInputStream fis=new FileInputStream("./commonData/commonD.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sn= wb.getSheet(sheetNum);
		Row rn=sn.getRow(rowNum);
		Cell cn=rn.getCell(cellNum);
		String value =cn.getStringCellValue();
		return value;
	}

	public int getLastRowcount(String sheetnum)throws Throwable{

		FileInputStream fis=new FileInputStream("./commonData/commonD.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetnum).getLastRowNum();
	}

}
