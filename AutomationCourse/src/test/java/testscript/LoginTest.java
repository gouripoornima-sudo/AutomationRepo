package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasic.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
    
	@Test
	public void verifyUserLoginwithValidCredentials() throws IOException
	{
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield =driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement submittbutton=driver.findElement(By.id("login-button"));
		//submittbutton.click();
		String username=ExcelUtility.readStringData(0, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
        login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickLoginButton();
	}
	@Test
	public void verifyUserLoginwithInvalidCredentials() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0, "LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
        login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickLoginButton();
	}
	@Test
	public void verifyLoginwithInvalidUsername() throws IOException
	{
		String username=ExcelUtility.readStringData(2, 0, "LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
        login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickLoginButton();
	}
	@Test
	public void verifyLoginwithInvalidPassword() throws IOException
	{
		String username=ExcelUtility.readStringData(3, 0, "LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
        login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickLoginButton();
	}
	
}
