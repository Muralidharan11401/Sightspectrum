package testNG;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Test
	@Parameters("Name")
	
	public void printName(String a) {
		System.out.println("Name is" + a);
	}
	@Test
	@Parameters("ID")
	
	public void printId(int b) {
		System.out.println("EmpID is" +" "+ b);
		
	}
	

}
