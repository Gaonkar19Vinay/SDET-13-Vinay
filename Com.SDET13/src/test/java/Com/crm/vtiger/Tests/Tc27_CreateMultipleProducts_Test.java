package Com.crm.vtiger.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.FileUtility;
import Com.crm.vtiger.GenericUtils.JavaUtility;
import Com.crm.vtiger.GenericUtils.WebdriverUtility;

public class Tc27_CreateMultipleProducts_Test {
	JavaUtility J=new JavaUtility();
	WebdriverUtility U= new WebdriverUtility();
	FileUtility F= new FileUtility();
	@Test(groups= {"smoke test", "regression test"})
	public void CreateProduct() throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		U.waitUntilPageload(driver);
		driver.manage().window().maximize();
		//open the URL
		
		driver.get("http://localhost:8888/");
		
		//Login to application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Click on Import Product LookUp
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Import Products']")).click();
		driver.findElement(By.id("import_file")).click();
		driver.findElement(By.id("import_file"));
	
		
//		//WebElement target1 = driver.findElement(By.xpath("//select[@id='type']"));
//		//WebElement target2 = driver.findElement(By.id("file_encoding"));
//		WebElement target3 = driver.findElement(By.id("delimiter"));
//		U.waitUntilPageload(driver);
//		U.DropDownbyvisibletext(target1, "VCard");
//		U.DropDownbyvisibletext(target2,"UTF-8");
//		U.DropDownbyvisibletext(target3, ", (comma)");
//		driver.findElement(By.id("auto_merge")).click();
		
}
}