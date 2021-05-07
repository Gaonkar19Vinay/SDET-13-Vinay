package Com.crm.vtiger.Tests;

import org.testng.annotations.Test;

import Com.crm.vtiger.GenericUtils.ExcelUtility;

public class WriteExcelData {
@Test
public void writedata() throws Throwable {
	
	ExcelUtility EX= new ExcelUtility();
	EX.writeExcelData("sheet2", 0, 0,"Organisation");
}
}