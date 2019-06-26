package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo6 {
	public WebDriver driver;

	@Parameters("mybrowser")
	@BeforeTest
	public void launch(String mybrowser) {
		
		if(mybrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/chromedrivernew.exe");
			driver = new FirefoxDriver();
		
			
		}
		else if(mybrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
			driver = new ChromeDriver();
		
		}
	
	}
	@Test
	public void testcase() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				
	}
}
