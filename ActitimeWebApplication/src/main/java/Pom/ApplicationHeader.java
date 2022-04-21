package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath="//div[text()='Time-Track']")
	private WebElement timeTrack;
	
	@FindBy (xpath="//div[text()='Tasks']")
	private WebElement tasks;
	
	@FindBy (xpath="//div[text()='Reports']")
	private WebElement reports;
	
	@FindBy (xpath="//div[text()='Users']")
	private WebElement users;
	
	@FindBy (xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	//make constructor public to access all methods in test
		public ApplicationHeader(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void openTimeTrack()
		{
			timeTrack.click();
		}
		public void openTasks()
		{
			tasks.click();
		}
		public void openReports()
		{
			reports.click();
		}
		public void openUsers()
		{
			users.click();
		}
		
		public void logoutFromApplication()
		{
			logOut.click();
		}
		
		
		//Method 2
		public void loginToApplication()
		{
			timeTrack.click();
			tasks.click();
			reports.click();
			users.click();
			logOut.click();
		}
		

}
