package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	String name = "bharani";
	@Test
	public void checkEquals() {
		
		Assert.assertEquals(name, "Bharani");
		
	}

}
