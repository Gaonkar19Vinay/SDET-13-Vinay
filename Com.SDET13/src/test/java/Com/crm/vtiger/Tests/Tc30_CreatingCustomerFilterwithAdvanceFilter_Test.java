package Com.crm.vtiger.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;

public class Tc30_CreatingCustomerFilterwithAdvanceFilter_Test extends Baseclass {
	
	@Test(groups= {"smoke test", "regression test"})
	public void CreateProduct() throws InterruptedException {
		
		//To select qickdrop down create filter link
		        WebElement target1 = driver.findElement(By.id("qccombo"));
		        wUtil.DropDownbyvisibletext(target1,"New Contact" );
		        wUtil.waitUntilPageload(driver);
		        driver.findElement(By.xpath("(//input[@name='button'])[2]")).click();
		        
				driver.findElement(By.xpath("//a[text()='Products']")).click();
				driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
				driver.findElement(By.name("viewName")).sendKeys("Product_Details_Deepu");
				driver.findElement(By.name("setDefault")).click();
				driver.findElement(By.xpath("//b[text()='Standard Filters']")).click();
		// to filter dropdown list
				WebElement target2 = driver.findElement(By.xpath("//select[@class='select small']"));
				WebElement target3 = driver.findElement(By.name("stdDateFilter"));
				
				wUtil.DropDownbyvisibletext(target2,"Products - Sales Start Date");
			    wUtil.DropDownbyvisibletext(target3, "Custom");
			    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Calendar.gif']")).click();
			    driver.findElement(By.xpath("//td[text()='21']")).click();
			
			    driver.findElement(By.name("enddate")).sendKeys("2021-05-26");
			    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	}}