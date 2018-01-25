package projectPractice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    XSSFSheet ExcelWSheet;
		XSSFWorkbook ExcelWBook;
        XSSFCell Cell;
        XSSFRow Row;
        WebDriver driver = null;
        try{
        
        FileInputStream ExcelFile = new FileInputStream("D:\\Automation\\Workspace\\projectPractice\\data.xlsx");

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet("Login");

		} catch (Exception e){

			try {
				throw (e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
		WebDriverWait wb =new WebDriverWait(new FirefoxDriver(), 20);
	    wb.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id=123]"))));
        //wb.wait(ExpectedConditions.textToBePresentInElement(locator, text)
		}
        
      

	
	}
	
	
	
}	

	


