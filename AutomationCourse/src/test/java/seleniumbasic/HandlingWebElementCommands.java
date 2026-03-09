package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base {
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox= driver.findElement(By.id("single-input-field"));
		messagebox.sendKeys("Test Message");
		WebElement showbutton=driver.findElement(By.id("button-one"));
		System.out.println("Is Displayed or not ? : "+showbutton.isDisplayed());
		System.out.println("SHow button is enabled or not ? : "+showbutton.isEnabled());
		showbutton.click();
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
		messagebox.clear();	
		showbutton.isDisplayed();
	}

	public static void main(String[] args) 
	{
		HandlingWebElementCommands commands=new HandlingWebElementCommands();
		commands.browserLaunch();
		commands.verifyWebElement();
	}

}
