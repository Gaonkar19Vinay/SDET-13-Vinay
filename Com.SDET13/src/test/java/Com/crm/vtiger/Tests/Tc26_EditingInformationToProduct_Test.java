package Com.crm.vtiger.Tests;



import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;

public class Tc26_EditingInformationToProduct_Test extends Baseclass {
	
	@Test(groups= {"smoke test", "regression test"})
	   public void EditingInformation() throws IOException, Throwable {
		
		
		//To create product 
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("Keyboard");
		driver.findElement(By.name("button")).click();
		
		//To edit description to product
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.name("search_text")).sendKeys("Keyboard");
		
		
	    
		WebElement target = driver.findElement(By.name("search_field"));
		Thread.sleep(3000);
		wUtil.DropDownbyvisibletext(target, "Product Name");
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("(//a[text()='Keyboard'])[14]")).click();
		driver.findElement(By.xpath("(//input[@title='Edit [Alt+E]'])[2]")).click();
	driver.findElement(By.name("description")).sendKeys("sbdbcsdc");
	driver.findElement(By.name("button")).click();
		
		
		
		
		
	

}}
