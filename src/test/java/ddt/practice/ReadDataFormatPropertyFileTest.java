
package ddt.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFormatPropertyFileTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./commondata.properties");
		 Properties p =new Properties();
		 p.load(fis);
		 String value = p.getProperty("url");
		 System.out.println(value);
		 String value1= p.getProperty("username");
		 System.out.println(value1);
		 String value2=p.getProperty("password");
		 System.out.println(value2);
	     
	
		 
		 
		 
		
		// TODO Auto-generated method stub

	}

}
