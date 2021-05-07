package Com.crm.vtiger.assigntests;



import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.Baseclass;
import Com.crm.vtiger.objectrepository.lib.CreateProductpage;
import Com.crm.vtiger.objectrepository.lib.Homepage;
import Com.crm.vtiger.objectrepository.lib.ProductInformationpage;
import Com.crm.vtiger.objectrepository.lib.Productpage;
/**
 * 
 * @author VINAY
 *
 */
public class Tc26_EditingInformationToProduct_Test extends Baseclass {
	/**
	 * 
	 * @throws IOException
	 * @throws Throwable
	 */
	@Test(groups= {"smoke test", "regression test"})
	   public void EditingInformation() throws IOException, Throwable {
		String pname="keyboard"+JUtil.getRandomData();
		// To navigate home page
		Homepage hp=new Homepage(driver);
		hp.ClickonProductlink();
		// To Navigate Productpage
		Productpage ppage=new Productpage(driver);
		ppage.CreateProduct();
		// To naviigate create product page
		CreateProductpage createpage=new CreateProductpage(driver);
		createpage.createproductpage(pname);
		
		// To navigate product page
		hp.ClickonProductlink();
		
		// To edit product page by using searchfeild
		ppage.editproduct(pname,"Product Name" ,"abcd");
		
		
		
		
//		//To navigate product page
//	    Productpage	Ppage=homepage.ClickonProductlink();
//	    
//	    //To  navigate createproduct page
//	     CreateProductpage  createPpage=Ppage.CreateProduct();
//	     
//	     //To navigate create new product 
//	     ProductInformationpage PInfpage=createPpage.createproductpage(pname);
//	     
//	     //To Verify the productname
//	     Assert.assertEquals(pname, PInfpage.getProductnameTF().getText());
//	     
//	     //To navigate product page
//	     Productpage	Ppage1=homepage.ClickonProductlink();
//	     
//	     //To Edit description to product
//	     Ppage1.editproduct(pname,"Product Name", "abcd");
//	      
	     
	    
	
		
		

		
		
		
		
		
	

}}
