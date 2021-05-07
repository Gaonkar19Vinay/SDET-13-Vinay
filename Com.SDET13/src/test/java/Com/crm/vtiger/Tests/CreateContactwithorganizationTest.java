package Com.crm.vtiger.Tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CreateContactwithorganizationTest {
	@Test
	public void CreateOrganization() {
		//Launch Browser
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Get URL
		
		driver.get("http://localhost:8888/");
		
		//login to the applications
		
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
		
		// Navigate to Organisation
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Create a contact with organization
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Gaonkar");
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		Set<String> child = driver.getWindowHandles();
		for( String b:child) {
		
			driver.switchTo().window(b);
			
			
	
	}
		driver.findElement(By.xpath("//a[text()='vinay']")).click();
		driver.findElement(By.name("button")).click();
		
//		//to Signout
//		WebElement ele = driver.findElement(By.linkText("themes/softed/images/user.PNG"));
//		Actions s= new Actions(driver);
//		s.moveToElement(ele);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}
}
