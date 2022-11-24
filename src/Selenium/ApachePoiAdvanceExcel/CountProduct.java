package Selenium.ApachePoiAdvanceExcel;

import java.io.FileInputStream;

// getText() ---> alternatives 1) get attribute("innerText") 2) get attribute("textContent")

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountProduct {
	public static WebDriver driver;
    static FileInputStream file;
    static String value;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// read data from excel 
	    file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
        value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(28).getCell(0).getStringCellValue();
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(value);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		List<WebElement> subCat = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		
		for(int i=0;i<subCat.size();i++) {
			List<WebElement> subCat1 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat1.get(i);
			String catagory = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement a = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String b = a.getText();
			System.out.println(catagory+"==> contains product =====>>>"+b);
			driver.navigate().back();
		}

	}

}
