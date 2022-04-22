package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Variables
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;

	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;

	@FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement keepMeLoginCheckbox;

	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginButtonText;

	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginButton;

	// constructor made public to access all methods in testclass
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Methods
	public void sendUserName(String usrName)
	{
		userName.sendKeys(usrName);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void selectKeepmeLoginCheckbox()
	{
		keepMeLoginCheckbox.click();
	}
	public String getTextOnLoginButton()
	{
		String text = loginButton.getText();
		return text;
	}
	public void clickloginButton()
	{
		loginButton.click();
	}


	//	//Method writing 2 option
	//	
	//	public void loginToApplication()
	//	{
	//		userName.sendKeys("admin");
	//		password.sendKeys("manager");
	//		keepMeLoginCheckbox.click();
	//		loginButton.click();
	//	}


}
