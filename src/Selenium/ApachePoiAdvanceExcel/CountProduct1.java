package Selenium.ApachePoiAdvanceExcel;

import java.io.FileInputStream;
import Selenium.ScreenShot.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountProduct1 {

	// getText() ---> alternatives 1) get attribute("innerText") 2) get attribute("textContent")
	public static WebDriver driver;
    static FileInputStream file;
    static String value;
    static boolean b= true;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// read data from excel 
	    file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
//        value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(28).getCell(0).getStringCellValue();
	    
        
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
//		
		

		System.out.println("In SchoolWear Catagery products");
		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(28).getCell(0).getStringCellValue();
		   driver.get(value);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		 
		   List<WebElement> subCat3 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		
		
		for(int i=0;i<subCat3.size();i++) {
			List<WebElement> subCat4 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat4.get(i);
			String catagory1 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement c = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String d = c.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory1+"==> contains product =====>>>"+d);
			driver.navigate().back();
		}  
		
		     driver.navigate().back();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		  String value1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(29).getCell(0).getStringCellValue();
		   driver.get(value1);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> subCat4 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		
		System.out.println("In Boys Catagery products");
		for(int i=0;i<subCat4.size();i++) {
			List<WebElement> subCat5 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat5.get(i);
			String catagory2 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement e = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String f = e.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory2+"==> contains product =====>>>"+f);
			driver.navigate().back();
		}

	
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("In Girls Catagery products");
		value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(30).getCell(0).getStringCellValue();
		   driver.get(value);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  List<WebElement> subCat5 = driver.findElements(By.xpath("//div[@class='button-list-button-wrap']/a"));
		

		for(int i=0;i<subCat5.size();i++) {
			List<WebElement> subCat6 = driver.findElements(By.xpath("//div[@class='button-list-button-wrap']/a"));
			WebElement ele = subCat6.get(i);
			String catagory3 = ele.getText();
			ele.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement g = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String h = g.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory3+"==> contains product =====>>>"+h);
			driver.navigate().back();
		}
	
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("In Baby Catagery products");
		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(31).getCell(0).getStringCellValue();
		   driver.get(value); 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> subCat7 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		   
		for(int i=0;i<subCat7.size();i++) {
			List<WebElement> subCat8 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat8.get(i);
			String catagory4 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement k = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String l = k.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory4+"==> contains product =====>>>"+l);
			driver.navigate().back();
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("In Women Catagery products");
		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(32).getCell(0).getStringCellValue();
		   driver.get(value);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> subCat9 = driver.findElements(By.xpath("//div[@class='button-list-button-wrap']/a"));
		   
		for(int i=0;i<subCat9.size();i++) {
			List<WebElement> subCat10 = driver.findElements(By.xpath("//div[@class='button-list-button-wrap']/a"));
			WebElement ele = subCat10.get(i);
			String catagory5 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement m = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String n = m.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory5+"==> contains product =====>>>"+n);
			driver.navigate().back();
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("In Homeware Catagery products");
		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(35).getCell(0).getStringCellValue();
		   driver.get(value);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> subCat11 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		   
		for(int i=0;i<subCat11.size();i++) {
			List<WebElement> subCat12 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat12.get(i);
			String catagory6 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement o = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String p = o.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory6+"==> contains product =====>>>"+p);
			driver.navigate().back();
		}
		
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("In Men Catagery products");
		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(33).getCell(0).getStringCellValue();
		   driver.get(value);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   List<WebElement> subCat13 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
		   
		for(int i=0;i<subCat13.size();i++) {
			List<WebElement> subCat14 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
			WebElement ele = subCat14.get(i);
			String catagory7 = ele.getText();
			ele.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement q = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
			String r = q.getAttribute("innerText");
			System.out.println(i+1 +") "+catagory7+"==> contains product =====>>>"+r);
			driver.navigate().back();
		}
//		
//		
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println("In HomeWare Catagery products");
//		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(37).getCell(0).getStringCellValue();
//		   driver.get(value);
//		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		   List<WebElement> subCat10 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
//		   
//		for(int i=0;i<subCat10.size();i++) {
//			List<WebElement> subCat11 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
//			WebElement ele = subCat11.get(i);
//			String catagory7 = ele.getText();
//			ele.click();
//			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			WebElement s = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
//			String t = s.getAttribute("innerText");
//			System.out.println(i+1 +") "+catagory7+"==> contains product =====>>>"+t);
//			driver.navigate().back();
//		}
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println("In  Branded products");
//		   value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(38).getCell(0).getStringCellValue();
//		   driver.get(value);
//		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		   List<WebElement> subCat11 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
//		   
//		for(int i=0;i<subCat11.size();i++) {
//			List<WebElement> subCat12 = driver.findElements(By.xpath("//div[@class='sidebar-links-wrap']/a"));
//			WebElement ele = subCat12.get(i);
//			String catagory8 = ele.getText();
//			ele.click();
//			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			WebElement u = driver.findElement(By.xpath("//p[@data-testid='plp-total-products']"));
//			String v = u.getAttribute("innerText");
//			System.out.println(i+1 +") "+catagory8+"==> contains product =====>>>"+v);
//			driver.navigate().back();
//		}
//		
		driver.close();
	}

}
