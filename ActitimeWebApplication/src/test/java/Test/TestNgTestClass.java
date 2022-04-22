package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.ApplicationHeader;
import Pom.LoginPage;

public class TestNgTestClass {
	
	WebDriver driver;
	ApplicationHeader applicationHeader;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
		
	@BeforeMethod
	public void loginToActitime()
	{
		
		driver.get("http://localhost/login.do");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.clickloginButton();
	}
	
	@Test
	public void toVerifyTaskButton()
	{
		
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openTasks();
		
		
	}
	
	@Test
	public void toVerifyUserButton()
	{
		applicationHeader = new ApplicationHeader(driver);
		applicationHeader.openUsers();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		applicationHeader.clickOnLogout();
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
}
