package seleniumbasic;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJSExecuter extends Base {
	public void verifyJSExecuter()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	    WebElement exec=driver.findElement(By.id("single-input-field"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",exec);
	    js.executeScript("window.scrollBy(0,350)", "");
	   
	    
	}

	public static void main(String[] args) {
		HandlingJSExecuter jsexec=new HandlingJSExecuter();
		jsexec.browserLaunch();
		jsexec.verifyJSExecuter();
	}

}
