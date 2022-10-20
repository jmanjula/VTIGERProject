package testNG.prac;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotation 
{
@BeforeSuite
public void BS()
{
	System.out.println("BS");
}

@AfterSuite
public void AS()
{
	System.out.println("AS");
}
@BeforeTest
public void bT()
{
	System.out.println("BT");
}
@AfterTest
 public void AT()
 {
	System.out.println("AT");	
}
@BeforeClass
public void BC() {
	System.out.println("BC");
	
}
@AfterClass
public void AC() {
	System.out.println("AC");
	
	
}
@BeforeMethod
public void BM() {
	System.out.println("BM");
}
@AfterMethod
public void AM() {
	System.out.println("AM");
}
}
