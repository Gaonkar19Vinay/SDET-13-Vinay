package Com.crm.vtiger.objectrepository.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.vtiger.GenericUtils.WebdriverUtility;
/**
 * 
 * @author VINAY
 *
 */
public class Productpage extends WebdriverUtility {
	WebDriver driver;
	public Productpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
   @FindBy(xpath="//img[@title='Create Product...']")
   private WebElement createproductbtn;
   
   @FindBy(name="search_text")
   private WebElement searchTF;
   
   @FindBy(name="search_field")
   private WebElement searchfeildTF;
   
   @FindBy(name="submit")
   private WebElement searchnowBTN;
   
   @FindBy(xpath="//a[text()='edit']")
   private WebElement editBTN;
   
   @FindBy(xpath="//textarea[@name='description']")
   private WebElement descriptionTF;
   
   @FindBy(xpath="//a[text()='Create Filter']")
   private WebElement createfltrlnk;
   
   

public WebElement getSearchTF() {
	return searchTF;
}

public WebElement getSearchfeildTF() {
	return searchfeildTF;
}

public WebElement getSearchnowBTN() {
	return searchnowBTN;
}

public WebElement getCreateproductbtn() {
	return createproductbtn;
}
   /**
    * 
    * @return
    */
public CreateProductpage CreateProduct() {
	createproductbtn.click();
	return new CreateProductpage(driver);
	
}
/**
 * 
 * @param productname
 * @param visibletext
 * @param description
 */
   public void editproduct(String productname,String visibletext,String description ) {
	   searchTF.sendKeys(productname);
	   DropDownbyvisibletext(searchfeildTF,visibletext);
	   searchnowBTN.click();
	   editBTN.click();
	   descriptionTF.sendKeys(description);	
   }
	 public void clickfilterlink()  {
		 createfltrlnk.click();
   }
}
