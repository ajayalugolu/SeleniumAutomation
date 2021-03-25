package ExcelReadWrite;
import org.apache.poi.xssf.streaming.SheetDataWriter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel 
{
	WebDriver driver;
	public ReadExcel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void read() throws Exception
{
	File src=new File("C://Users//Ajay//Desktop//Salesforce.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Accounts");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(0);
	String accounttonavigate=cell.getStringCellValue();
	fis.close();
	
	
}
}
