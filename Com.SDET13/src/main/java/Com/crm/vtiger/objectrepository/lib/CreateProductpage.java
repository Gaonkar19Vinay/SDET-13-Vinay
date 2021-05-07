package Com.crm.vtiger.objectrepository.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author VINAY
 *
 */
public class CreateProductpage {
	WebDriver driver;
	public CreateProductpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
    @FindBy(name="productname")
    private WebElement productnameTF;
    
    @FindBy(name="button")
    	private WebElement saveBTN;

	public WebElement getProductnameTF() {
		return productnameTF;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}
    /**
     * 
     * @param productname
     * @return
     */
	public ProductInformationpage createproductpage(String productname) {
		productnameTF.sendKeys(productname);
		saveBTN.click();
		return new ProductInformationpage(driver);
	}
    
}
