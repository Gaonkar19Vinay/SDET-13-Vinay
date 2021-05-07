package Com.crm.vtiger.GenericUtils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author VINAY
 *
 */
public class WebdriverUtility {
	
/**
 * To wait for pageload until 20 seconds
 * 
 * @param driver
 */
   
	public void waitUntilPageload( WebDriver driver) {
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/**
	 * To wait for Elementtobeclickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void ElementTobeclickable( WebDriver driver,WebElement element) {
		WebDriverWait wb=new WebDriverWait(driver,20);
		wb.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * This method used to mouseover action
	 * @param driver
	 * @param Target
	 */
	public void MouseOver(WebDriver driver,WebElement Target) {
		Actions action=new Actions(driver);
		action.moveToElement(Target).perform();
	}
	/**
	 * This Method used to Doubleclick mouse action
	 * @param driver
	 * @param Target
	 */
	public void DoubleClick(WebDriver driver,WebElement Target) {
		Actions action=new Actions(driver);
		action.doubleClick(Target);
	}
	/**
	 * This method is used to Dropdown using Index value
	 * @param target
	 * @param index
	 */
	public void DropDownbyIndex(WebElement target,int index) {
		Select select= new Select(target);
		select.selectByIndex(index);
	}
		/**
		 * This method is used to Dropdown using visibeltext
		 * @param target
		 * @param text
		 */
	public void DropDownbyvisibletext(WebElement target,String text) {
		Select select=new Select(target);
		select.selectByVisibleText(text);
	}
	public void SwitchtoWindow(WebDriver driver,String partiallinktext) {
		Set<String> window = driver.getWindowHandles();
	     for(String b:window) {
	    	 String actualtitle = driver.switchTo().window(b).getTitle();
	    	 if(actualtitle.equals(partiallinktext)) {
	    		 break;
	    	 }
	     }
	}
	
	
}
