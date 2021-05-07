package Com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author VINAY
 *
 */
public class ExcelUtility {
	/**
	 * This Method is used to readdata from excel using sheetname,rownumber.coulmnnuumber
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @throws Throwable
	 */
  public void getExcelData(String sheetname,int rownum,int cellnum) throws Throwable {
	  
	  FileInputStream file=new FileInputStream("");
	  Workbook wb = WorkbookFactory.create(file);
	  wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
  }
  
  /**
   * To fetch Data based 
   * @param sheetName
   * @param tcID
   * @param headerValue
   * @return
   * @throws Throwable
   */
  
  public String getExcelData(String sheetName,String tcID,String headerValue) throws Throwable {
	  FileInputStream file=new FileInputStream(Iconstant.EXCELPATH);
	  Workbook workbook=WorkbookFactory.create(file);
	  Sheet sheet = workbook.getSheet(sheetName);
	  int lastRow=sheet.getLastRowNum();
	  int expectedRow=0;
	  for(int i=0;i<=lastRow;i++) {
	   String testCaseID=sheet.getRow(i).getCell(0).getStringCellValue();
	   if(testCaseID.equalsIgnoreCase(tcID)) {
	    expectedRow=i;
	    break;
	   }
	  }
	  expectedRow--;
	  int expectedColumn=0;
	  int lastCell=sheet.getRow(expectedRow).getLastCellNum();
	  for(int j=0;j<lastCell;j++) {
	   String value=sheet.getRow(expectedRow).getCell(j).getStringCellValue();
	   if(value.equalsIgnoreCase(headerValue)) {
	    expectedColumn=j;
	    break;
	   }
	  }
	  return sheet.getRow(expectedRow+1).getCell(expectedColumn).getStringCellValue();
	 }
  
  
  /**
   * To Write Data in ExcelSheet
   * @param sheetname
   * @param rownumber
   * @param cellnum
   * @param value
   * @throws Throwable
   */
  public void writeExcelData(String sheetname,int rownumber,int cellnum,String value) throws Throwable {
	   FileInputStream file =new FileInputStream(Iconstant.EXCELPATH);
	   Workbook wb = WorkbookFactory.create(file);
	   wb.createSheet(sheetname).createRow(rownumber).createCell(cellnum).setCellValue(value);
	   FileOutputStream  writefile=new FileOutputStream(Iconstant.EXCELPATH);
	   wb.write(writefile);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

  
}
