package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LogCla 
{
  public XSSFWorkbook wb=null;  
  public XSSFSheet sheet=null;
  public XSSFRow row=null;
  public XSSFCell cell=null;
 public LogCla(String datasheet) throws IOException 
 {
	File f=new File(datasheet);
	FileInputStream fis =new FileInputStream(f);
	wb=new XSSFWorkbook(fis);
	fis.close();
}
 public int rowcount(int index) 
 {
	int row=wb.getSheetAt(index).getLastRowNum();
	row++;
	return row; 
 }
 public String getdata(int shno,int rno,int cno) 
 {
	sheet=wb.getSheetAt(shno);
	row=sheet.getRow(rno);
	cell=row.getCell(cno);
	return null;
	 
 }
}
