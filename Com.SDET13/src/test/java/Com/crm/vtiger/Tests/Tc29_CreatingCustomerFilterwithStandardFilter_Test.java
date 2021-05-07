package Com.crm.vtiger.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;

public class Tc29_CreatingCustomerFilterwithStandardFilter_Test extends Baseclass {
	
	
	@Test(groups= {"smoke test", "regression test"})
	public void CreateCustomer() throws InterruptedException {
		
		//To select qickdrop down create filter link
				driver.findElement(By.xpath("//a[text()='Products']")).click();
				driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
				driver.findElement(By.name("viewName")).sendKeys("Product_Details_Deepu");
				driver.findElement(By.name("setDefault")).click();
		//Move to Simple Time Filter
				WebElement target = driver.findElement(By.name("stdDateFilterField"));
				wUtil.DropDownbyvisibletext(target,"Products - Created Time");
				WebElement target1 = driver.findElement(By.name("stdDateFilter"));
				wUtil.DropDownbyvisibletext(target1,"Last 7 Days" );
		
		// Select Start date and end date in calender
		    driver.findElement(By.id("jscal_field_date_start")).sendKeys("2021-05-25");
		    driver.findElement(By.id("jscal_field_date_end")).sendKeys("2021-05-30");

				
			
}
}