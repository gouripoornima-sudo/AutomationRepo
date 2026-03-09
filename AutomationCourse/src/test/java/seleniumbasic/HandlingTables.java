package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
    public void verifyTable()
    {
    	driver.navigate().to("https://money.rediff.com/indices/nse");
    	//WebElement fulltable= driver.findElement(By.id("dataTable"));
    	//System.out.println(fulltable.getText());
    	WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
    	System.out.println(tablerow.getText());
    	WebElement tablecell=driver.findElement(By.xpath("//table[@id='dataTable']//tr[3]/td[2]"));
    	System.out.println(tablecell.getText());
    	
    }
	public static void main(String[] args) {
		HandlingTables table=new HandlingTables();
		table.browserLaunch();
		table.verifyTable();

	}

}
