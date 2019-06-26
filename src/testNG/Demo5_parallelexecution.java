package testNG;

import org.testng.annotations.Test;

public class Demo5_parallelexecution {

	@Test
    public void Test1() {
		System.out.println("This is My first Testcase");
    }
	
	@Test
    public void Test2() {
		System.out.println("This is My second Testcase");
    }
	
	@Test
    public void Test3() {
		System.out.println("This is My third Testcase");
    }
}
