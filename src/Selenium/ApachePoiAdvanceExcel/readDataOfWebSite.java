package Selenium.ApachePoiAdvanceExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readDataOfWebSite {
     static FileInputStream file;
     static String value;
     static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read data from excel 
		
	    file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\WebSite.xlsx");
        value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
  
        
        
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(value);
        
         List<WebElement> MainCatagory = driver.findElements(By.xpath("//div[@id='platform_modernisation_meganav']//a"));
         
        
        
        for(int i=0;i<MainCatagory.size();i++) {
        	WebElement firstEle = MainCatagory.get(i);
        	String ele = firstEle.getText();
        	System.out.println(ele);
        	
        } 
	}
       
      
}
