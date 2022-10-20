package testNG.prac;

import org.testng.annotations.Test;

public class Grpflags {
	
	@Test(groups="smoke")
	
	
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test(groups="Regression")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups="Integration")
	public void test3() {
		System.out.println("test3");
	}

}
