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
public class Login {
	
	public Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="user_name")
	private WebElement usernameTF;
	
	@FindBy(name="user_password")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement submitBTN;

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSubmitBTN() {
		return submitBTN;
	}
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void loginpage(String username,String password) {
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		submitBTN.click();
		
	}
	

}
