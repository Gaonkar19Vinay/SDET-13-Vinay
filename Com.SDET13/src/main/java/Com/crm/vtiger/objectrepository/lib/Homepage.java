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
public class Homepage extends WebdriverUtility {
	WebDriver driver;
	public Homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrtarorBTN;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;

	public WebElement getProductlink() {
		return productlink;
	}

	public WebElement getAdminstrtarorBTN() {
		return adminstrtarorBTN;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	public Productpage ClickonProductlink() {
		productlink.click();
		return new Productpage(driver);
	}
	/**
	 * This method is used to logoutapplication
	 */
	public void logoutpage() {
		MouseOver(driver,adminstrtarorBTN);
		signoutlink.click();
}}
