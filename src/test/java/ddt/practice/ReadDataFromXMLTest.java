package ddt.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXMLTest {
	@Test
	public void readDataFromTest(XmlTest xml, char[] UN, char[] URL)
	{
		String url =xml.getParameter("url");
		System.out.println(url);
		String un =xml.getParameter("un");
		System.out.println(un);
		
	}
}
	
	


