package Com.crm.vtiger.assigntests;

import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;
import Com.crm.vtiger.objectrepository.lib.Homepage;
import Com.crm.vtiger.objectrepository.lib.NewCustomViewpage;
import Com.crm.vtiger.objectrepository.lib.Productpage;
/**
 * 
 * @author VINAY
 *
 */
public class Tc29_CreatingCustomerFilterwithStandardFilter_Test extends Baseclass {
	/**
	 * This Method is used to create customer with stanadrd filter
	 * @throws InterruptedException
	 */
	
	@Test(groups= {"smoke test", "regression test"})
	public void CreateCustomerwithstandardfilter() throws InterruptedException {
		// To navigate homepage
		Homepage hp=new Homepage(driver);
		hp.ClickonProductlink();
		
		// To Navigate Productpage
	    Productpage ppage=new Productpage(driver);
	    ppage.clickfilterlink();
		
		// To Navigate NewCustomviewpage
	    NewCustomViewpage cpage=new NewCustomViewpage(driver);
	    cpage.Creatingcustomerfilteronlyselectsetdefault("Product_Details_Deepu");
		cpage.CreatingcustomerfilterwithStandardfilter("Products - Created Time", "Last 7 Days");
		
		
		
		
		
		
		
		
		
		
//		//To select qickdrop down create filter link
//				driver.findElement(By.xpath("//a[text()='Products']")).click();
//				driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
//				driver.findElement(By.name("viewName")).sendKeys("Product_Details_Deepu");
//				driver.findElement(By.name("setDefault")).click();
//		//Move to Simple Time Filter
//				WebElement target = driver.findElement(By.name("stdDateFilterField"));
//				wUtil.DropDownbyvisibletext(target,"Products - Created Time");
//				WebElement target1 = driver.findElement(By.name("stdDateFilter"));
//				wUtil.DropDownbyvisibletext(target1,"Last 7 Days" );
//		
//		// Select Start date and end date in calender
//		    driver.findElement(By.id("jscal_field_date_start")).sendKeys("2021-05-25");
//		    driver.findElement(By.id("jscal_field_date_end")).sendKeys("2021-05-30");

				
			
}
}