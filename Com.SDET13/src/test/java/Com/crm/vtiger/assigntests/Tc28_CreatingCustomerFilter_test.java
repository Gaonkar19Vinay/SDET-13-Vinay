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
public class Tc28_CreatingCustomerFilter_test extends Baseclass {
	/**
	 * This method is used to create customer by clicking createfilterlink
	 * @throws InterruptedException
	 */
	@Test(groups= {"smoke test", "regression test"})
	public void CreateProduct() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		hp.ClickonProductlink();
		
		// To Navigate Productpage
	    Productpage ppage=new Productpage(driver);
	    ppage.clickfilterlink();
		
		// To navigate new Customviewpage and select all checkbox
	    NewCustomViewpage cpage=new NewCustomViewpage(driver);
	    cpage.Creatingcustomerfilter("Product_Details_Deepu");	

}}
