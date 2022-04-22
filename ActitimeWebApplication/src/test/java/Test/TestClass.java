package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.ApplicationHeader;
import Pom.LoginPage;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");

		//create object of login page to access all methods in other class

		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.selectKeepmeLoginCheckbox();

		String loginText=loginPage.getTextOnLoginButton();
		if(loginText.equals("Login"))
		{
			System.out.println("PASS");	
		}
		else
		{
			System.out.println("FAIL");
		}

		loginPage.clickloginButton();


		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		applicationHeader.clickOnLogout();
		driver.quit();

	}

}
