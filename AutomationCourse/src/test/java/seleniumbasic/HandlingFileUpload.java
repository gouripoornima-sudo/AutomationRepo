package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.StreamCorruptedException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void fileUploadusingSendKeys()
	{
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	WebElement upload=driver.findElement(By.id("uploadfile_0"));
	upload.sendKeys("C:\\Users\\LENOVO\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Assignment1.pdf");
	WebElement checkbox=driver.findElement(By.id("terms"));
	checkbox.click();
	WebElement submitkeys=driver.findElement(By.id("submitbutton"));
	submitkeys.click();
	}
	public void fileUploadusingRobot() throws AWTException
	{
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement robo=driver.findElement(By.id("pickfiles"));
	robo.click();
	StringSelection s=new StringSelection("C:\\Users\\LENOVO\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\Assignment1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Robot r=new Robot();
	r.delay(2500); 
	r.keyPress(KeyEvent.VK_ENTER); 
	r.keyRelease(KeyEvent.VK_ENTER); 
	r.keyPress(KeyEvent.VK_CONTROL); 
	r.keyPress(KeyEvent.VK_V); 
	r.keyRelease(KeyEvent.VK_CONTROL); 
	r.keyRelease(KeyEvent.VK_V); 
	r.keyPress(KeyEvent.VK_ENTER); 
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}

	public static void main(String[] args) {
		HandlingFileUpload uploads=new HandlingFileUpload();
		uploads.browserLaunch();
		//uploads.fileUploadusingSendKeys();
		try {
			uploads.fileUploadusingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
