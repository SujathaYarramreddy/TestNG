package testNG;

import org.testng.annotations.Test;

public class Demo3_priority {

	@Test(priority=1)
	public void Lion() {
		System.out.println("This is first method");
	}
	

	@Test
	public void Elephant() {
		System.out.println("This is second method");
	}
	
	@Test(priority=2)
	public void Tiger() {
		System.out.println("This is third method");
	}
	@Test
	public void sunil() {
		System.out.println("This is a");
	}
	@Test
	public void B() {
		System.out.println("This is b");
	}
}
