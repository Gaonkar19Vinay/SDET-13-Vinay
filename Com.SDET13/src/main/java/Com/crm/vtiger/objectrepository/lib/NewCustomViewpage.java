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
public class NewCustomViewpage extends WebdriverUtility {
	
	public NewCustomViewpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getViewnameTF() {
		return viewnameTF;
	}

	public WebElement getSetdefaultCB() {
		return setdefaultCB;
	}

	public WebElement getSetmetricsCB() {
		return setmetricsCB;
	}

	public WebElement getSetStatusCB() {
		return setStatusCB;
	}

	public WebElement getSaveBTN() {
		return saveBTN;
	}

	@FindBy(xpath="//input[@class='detailedViewTextBox']")
	private WebElement viewnameTF;
	
	@FindBy(name="setDefault")
	private WebElement setdefaultCB;
	
	@FindBy(name="setMetrics")
	private WebElement setmetricsCB;
	
	@FindBy(name="setStatus")
	private WebElement setStatusCB;
	
	@FindBy(name="button2")
	private WebElement saveBTN;
	
	@FindBy(name="stdDateFilterField")
	private WebElement selectcoulmnFld;
	
	@FindBy(name="stdDateFilter")
	private WebElement selectdurationFLD;
	
	@FindBy(id="jscal_field_date_start")
	private WebElement startdateTF;
	
	@FindBy(id="jscal_field_date_end")
	private WebElement enddateTF;
	
	@FindBy(xpath="//select[@class='detailedViewTextBox']")
	private WebElement productinfoDDTab;
	
	@FindBy(xpath="//b[text()='Advanced Filters']")
	private WebElement advancefilterlinkTB;
	
	@FindBy(name="fval0")
	private WebElement textfeild;
	
	@FindBy(xpath="//select[@class='repBox']")
	private WebElement dropdownFld;
	/**
	 * 
	 * @param customername
	 */
	public void Creatingcustomerfilter(String customername ) {
		viewnameTF.sendKeys(customername);
		setdefaultCB.click();
		setmetricsCB.click();
		setStatusCB.click();
		saveBTN.click();
}
	/**
	 * 
	 * @param customername
	 */
	public void Creatingcustomerfilteronlyselectsetdefault(String customername) {
		viewnameTF.sendKeys(customername);
		setdefaultCB.click();

	}
	
	public WebElement getSelectcoulmnFld() {
		return selectcoulmnFld;
	}

	public WebElement getSelectdurationFLD() {
		return selectdurationFLD;
	}

	public WebElement getStartdateTF() {
		return startdateTF;
	}

	public WebElement getEnddateTF() {
		return enddateTF;
	}

	public WebElement getProductinfoDDTab() {
		return productinfoDDTab;
	}

	public WebElement getAdvancefilterlinkTB() {
		return advancefilterlinkTB;
	}

	public WebElement getTextfeild() {
		return textfeild;
	}

	public WebElement getDropdownFld() {
		return dropdownFld;
	}
   /**
    * 
    * @param visibletext
    * @param visibletext1
    */
	public void CreatingcustomerfilterwithStandardfilter(String visibletext,String visibletext1 ) {
		DropDownbyvisibletext(selectcoulmnFld,visibletext);
		DropDownbyvisibletext(selectdurationFLD,visibletext1);
		saveBTN.click();
	}
	/**
	 * 
	 * @param visibletext
	 * @param visibletext1
	 * @param productname
	 */
	public void CreatingcustomerfilterwithAdvancefilter(String visibletext,String visibletext1,String productname ) {
		advancefilterlinkTB.click();
		DropDownbyvisibletext(productinfoDDTab,visibletext);
		DropDownbyvisibletext(dropdownFld,visibletext1);
		textfeild.sendKeys(productname);
		saveBTN.click();
	}
}

