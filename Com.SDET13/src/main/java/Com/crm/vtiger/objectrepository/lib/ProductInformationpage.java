package Com.crm.vtiger.objectrepository.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationpage {
	/**
	 * 
	 * @param driver
	 */
	public ProductInformationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
   @FindBy(xpath="//span[@class='lvtHeaderText']")
   private WebElement productinfo;
   
   @FindBy(id="dtlview_Product Name")
   private WebElement productnameTF;

public WebElement getProductinfo() {
	return productinfo;
}

public WebElement getProductnameTF() {
	return productnameTF;
}
   
public void getproductinfo() {
	String acctproductinfo = productinfo.getText();
	
}
public void getproductnametext() {
	String acctproductname = productnameTF.getText();
	
}
   
}
