package Com.crm.vtiger.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreatOragnisationTest {

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
		driver.findElement(By.linkText("Organizations")).click();
		
		//Create Organisation
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("vinay6t");
		driver.findElement(By.name("button")).click();
		
		driver.findElement(By.xpath("(//img[@border=\"0\"])[6]")).click();
		//to Signout
				Actions s= new Actions(driver);
				WebElement ele = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
				s.moveToElement(ele).perform();
				driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		
	
	}
	
}
