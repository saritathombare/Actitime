package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement keepMeLoginCheckbox;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	//make constructor public to access all methods in test
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		userName.sendKeys("admin");
	}
	public void sendPassword()
	{
		password.sendKeys("manager");
	}
	public void selectKeepmeLoginCheckbox()
	{
		keepMeLoginCheckbox.click();
	}
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	
	//Method 2
	public void loginToApplication()
	{
		userName.sendKeys("admin");
		password.sendKeys("manager");
		keepMeLoginCheckbox.click();
		loginButton.click();
	}
	

}
