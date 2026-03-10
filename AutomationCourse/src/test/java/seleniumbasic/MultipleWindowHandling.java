package seleniumbasic;


import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firswindow=driver.getWindowHandle();
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String> handleIds=driver.getWindowHandles();
		Iterator <String> it=handleIds.iterator();
		while(it.hasNext())
		{
		String currentId=it.next();
		if(!currentId.equals(firswindow))
		{
			driver.switchTo().window(currentId);
			WebElement emailid=driver.findElement(By.name("emailid"));
			emailid.sendKeys("gouripoornima@gmail.com");
			WebElement button=driver.findElement(By.name("btnLogin"));
			button.click();
		}
		}
		
	}

	public static void main(String[] args) {
		MultipleWindowHandling mwindow=new MultipleWindowHandling();
		mwindow.browserLaunch();
		mwindow.verifyMultipleWindow();

	}

}
