package testNG;

import org.testng.annotations.Test;

public class Demo4_Cucumber {
	@Test(groups= {"Smoke"},priority=1)
	public void Test1() {
		System.out.println("Executing Smoke Test1");
	}
	
	@Test(groups= {"Smoke"},priority=2)
	public void Test2() {
		System.out.println("Executing Smoke Test2");
	}
	
	@Test(groups= {"Regression"},priority=3)
	public void Test3() {
		System.out.println("Executing Smoke Test3");
	}

}
