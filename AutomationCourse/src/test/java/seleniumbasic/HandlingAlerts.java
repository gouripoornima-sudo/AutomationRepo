package seleniumbasic;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
    public void verifySimpleAlerts()
    {
    driver.navigate().to("https://demoqa.com/alerts");
    WebElement simpleAlert=driver.findElement(By.id("alertButton"));
    simpleAlert.click();
    Alert alert=driver.switchTo().alert(); //Alert is a interface -to switch to pop window switch()-to press ok -alert()
    alert.accept();
    }
    public void verifyConfirmAlerts()
    {
    driver.navigate().to("https://demoqa.com/alerts");
    WebElement confirmAlert=driver.findElement(By.id("confirmButton"));
    confirmAlert.click();
    Alert al=driver.switchTo().alert();
    al.accept();
    }
    public void verifyPromptAlerts()
    {
    driver.navigate().to("https://demoqa.com/alerts");
    WebElement promptAlert=driver.findElement(By.id("promtButton"));
    promptAlert.click();
    Alert al=driver.switchTo().alert();
    al.sendKeys("Gouri Poornima");
    al.accept();
    }
	public static void main(String[] args) {
	HandlingAlerts alerts=new HandlingAlerts();
	alerts.browserLaunch();
	//alerts.verifySimpleAlerts();
	//alerts.verifyConfirmAlerts();
	alerts.verifyPromptAlerts();
	}

}
