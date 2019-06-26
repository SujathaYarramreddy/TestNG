package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo2_Testng {
	@BeforeSuite
	public void BS1() {
		System.out.println("This will execute first1");
	}
	@BeforeTest
	public void BT1() {
		  System.out.println("This is before second Test");
	  }
	@BeforeClass
	public void BC1() {
		  System.out.println("This is before my second class");
	  }
	
	@Test
	public void sutest3() {
		System.out.println("This is my third method");
		
	}
	

	@AfterClass
	public void AC1() {
		  System.out.println("This is After my second class");
	  }
	@AfterTest
	public void AT1() {
		  System.out.println("This is After second Test");
	  }
	@AfterSuite
	public void AS1() {
		System.out.println("This will execute last1");
	}
}
