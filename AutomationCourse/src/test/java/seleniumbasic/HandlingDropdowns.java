package seleniumbasic;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {
	public void verifyDropdowns()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown= driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(2);
		//select.selectByValue("sql");
		select.selectByVisibleText("Python");
			
	}
    public void verifyCheckBox()
    {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
        System.out.println("Is Selected or not ? "+ checkbox.isSelected());
		checkbox.click();
		
    }
    public void verifyRadioButton()
    {
    	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    	WebElement radioButton=driver.findElement(By.xpath("//input[@type='radio' and @value='blue']"));
    	radioButton.click();
    }
	public static void main(String[] args) {
    HandlingDropdowns drop=new HandlingDropdowns();
    drop.browserLaunch();
   // drop.verifyDropdowns();
    drop.verifyCheckBox();
    //drop.verifyRadioButton();
    
	}

}
