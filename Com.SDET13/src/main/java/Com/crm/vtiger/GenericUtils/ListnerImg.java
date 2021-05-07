package Com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerImg implements ITestListener {
 

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
    public void onTestFailure(ITestResult result) {
    	    String currentdate = new Date().toString().replace(":", "_").replace(" ", "_");
    	  String Faliedtestname = result.getMethod().getMethodName();
	      TakesScreenshot ts= (TakesScreenshot)Baseclass.sdriver;
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File dest= new File("./screenshot/"+Faliedtestname+"_"+currentdate+".png");
		   try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) { 
		
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
