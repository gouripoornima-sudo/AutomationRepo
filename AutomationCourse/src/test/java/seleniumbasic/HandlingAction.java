package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends Base {
	public void verifyRightClick()
	{
	WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	Actions action= new Actions(driver);
	action.contextClick(home).build().perform();
	
	
	}
    public void verifyMouseHover()
    {
    WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
    Actions action= new Actions(driver);
    action.moveToElement(home).build().perform();
    }
    public void verifyDragandDrop()
    {
    driver.navigate().to("https://demoqa.com/droppable");
    WebElement drag=driver.findElement(By.id("draggable"));
    WebElement drop=driver.findElement(By.id("droppable"));
    Actions action= new Actions(driver);
    action.dragAndDrop(drag, drop).build().perform();
    }
    public void verifyKeyboardAction() throws AWTException
    {
    	Robot robot= new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_T);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyRelease(KeyEvent.VK_T);
    }
	public static void main(String[] args) {
	HandlingAction act=new HandlingAction();
	act.browserLaunch();
	//act.verifyRightClick();
	//act.verifyMouseHover();
	//act.verifyDragandDrop();
	try {
		act.verifyKeyboardAction();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
