package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvider1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys(n);
	  driver.findElement(By.id("txtPassword")).sendKeys(s);
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("welcome")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	  Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "linda.anderson", "linda.anderson" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
