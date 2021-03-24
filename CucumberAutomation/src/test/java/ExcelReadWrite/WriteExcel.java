package ExcelReadWrite;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel 
{
	WebDriver driver;
	public WriteExcel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void write(String accountnamecreated) throws Exception
	{
		File src=new File("C://Users//Ajay//Desktop//Salesforce.xlsx");
		FileOutputStream fos=new FileOutputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.getSheet("Accounts");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		cell.setCellValue(accountnamecreated);
		workbook.write(fos);
	}

	
}
