package Com.crm.vtiger.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;

public class Tc28_CreatingCustomerFilter_test extends Baseclass {
	
	@Test(groups= {"smoke test", "regression test"})
	public void Createcustomerfilter() throws InterruptedException {
		
		//To select qickdrop down create filter link
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
		driver.findElement(By.name("viewName")).sendKeys("Product_Details_Deepu");
		driver.findElement(By.name("setDefault")).click();
		driver.findElement(By.name("setMetrics")).click();
		driver.findElement(By.name("setStatus")).click();
		driver.findElement(By.name("button2")).click();
}}
