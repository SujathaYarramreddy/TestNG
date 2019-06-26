package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void Test1() {
	String Exp= "Sunil";
	String Ac="Radha";
	Assert.assertEquals(Ac, Exp);

	} @Test(dependsOnMethods="Test1")
	public void Test2()
	{
	System.out.println("Test1 is passed so Test2 is executing");
	}

}
