package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	//public String baseUrl = "http://172.26.62.18:5000/#/login";	
	public String baseUrl = "http://google.com";
	public String driverPath = "D:\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void vrifyHomePageTitle() {
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launching the chrome driver");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close(); 
  }

}
