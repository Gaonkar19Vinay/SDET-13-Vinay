package Com.crm.vtiger.GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Com.crm.vtiger.objectrepository.lib.Homepage;
import Com.crm.vtiger.objectrepository.lib.Login;

public class Baseclass {

	public WebDriver driver;
	 public ExcelUtility eUtil=new ExcelUtility();
	 public FileUtility fUtil=new FileUtility();
	 public WebdriverUtility wUtil=new WebdriverUtility();
	 public Homepage homepage;
	 public JavaUtility JUtil=new JavaUtility();
	 public static WebDriver sdriver;
	 @BeforeSuite(groups= {"smoke test", "regression test"})
	 public void configBS() {
	  //connect to DB
	 }
	 
	 @BeforeTest(groups= {"smoke test", "regression test"})
	 public void configBT() {
	  //launch browser in parallel mode
	 }
	 
	 @BeforeClass(groups= {"smoke test", "regression test"})
	 public void openbrowser() throws Throwable {
	  String browserName="chrome";
	  if(browserName.equalsIgnoreCase("chrome")) {
	   
	   driver=new ChromeDriver();
	  }
	  else{
		  driver = new FirefoxDriver();
	  }
	  sdriver=driver;
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	 }
	 @BeforeMethod(groups= {"smoke test", "regression test"})
	 public void openapp() throws Throwable {
	  String url=fUtil.getPropertyData("url");
	  driver.get(url);
	  //login to the application
	  Login login=new Login(driver);
	  login.loginpage(fUtil.getPropertyData("username"),fUtil.getPropertyData("password"));
	  
	  
	  
	 }
	 @AfterMethod(groups= {"smoke test", "regression test"})
	  public void closeapp() {
			Homepage homepage=new Homepage(driver);
			homepage.logoutpage();
	  
	 }
	 
	 @AfterClass(groups= {"smoke test", "regression test"})
	 public void configAC() {
	  driver.quit();
	 }
	 
	 @AfterTest(groups= {"smoke test", "regression test"})
	 public void configAT() {
	  //close driver ref in parallel mode
	 }
	 
	 @AfterSuite(groups= {"smoke test", "regression test"})
	 public void configAS() {
	  // close DB connection
	 }


	}

