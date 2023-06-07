package testNG;

import org.testng.annotations.Test;

public class DependancisManagemnt {

	@Test(enabled=false)
	
	public void highschool() 
	{
		System.out.println("High school");
	}
	
	@Test(dependsOnMethods = "highschool")
	public void highersecondary()
	{
		System.out.println("Higher secondary");
	}
	
	@Test(dependsOnMethods = "highersecondary")
	public void engineering()
	{
		System.out.println("Engineering");
	}
	
	
}
