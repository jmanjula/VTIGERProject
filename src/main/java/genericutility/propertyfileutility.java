package genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfileutility {
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./commonData/commonD.properties");
		Properties p =new Properties();
		p.load(fis);
		String value =p.getProperty(key);
		return value;
		
	}
	
		
	
	}


