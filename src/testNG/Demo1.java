package testNG;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeSuite
	public void BS() {
		System.out.println("This will execute first");
	}
	
	@BeforeTest
	  public void BT() {
		  System.out.println("This will execute before Test start");
	  }

	  @BeforeClass
	  public void BC() {
		  System.out.println("This will execute before class start");
	  }

	  
	  @Test
	  public void sutest() {
		  System.out.println("This is my First Testcase");
	  }
	  @Test
	  public void sutest1() {
		  System.out.println("This is my Second Testcase");
	  }
	  @BeforeMethod
	  public void beforeTest() {
		  System.out.println("This will execute before each method");
	  }

	  @AfterMethod
	  public void afterTest() {
		  System.out.println("This will execute After each method");
	  }
	  @AfterClass
	  public void AC() {
		  System.out.println("This will execute after class start");
	  }

	  @AfterTest
	  public void AT() {
		  System.out.println("This will execute after Test start");
	  }
	  @AfterSuite
		public void AS() {
			System.out.println("This will execute last");
		}
}
