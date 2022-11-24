package Selenium.ReadTableFromWeb;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCompanies {
	
    public static WebDriver driver;
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	     driver=new ChromeDriver();
	     
	     driver.get("https://money.rediff.com/companies/b");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     List<WebElement> AllCat = driver.findElements(By.xpath("//ul[@class='company-list-alphabets']//a"));
	     int sz = AllCat.size();
	     
	     for(int i=1;i<=sz;i++) {
	    	 List<WebElement> AllCat1 = driver.findElements(By.xpath("//ul[@class='company-list-alphabets']//a"));
	    	 WebElement CatType = AllCat1.get(i);
	    	 CatType.click();
	    	 int allrows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
		     int allCols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]//td")).size();
		    
		     for(int j=1;j<=allrows;j++) {
		    	 for(int k=1;k<=3;k++) {      // try 3 
		    		String frow = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+j+"]//td["+k+"]")).getText();
		    		System.out.print(frow+"==");
		    	 }
		    	    System.out.println();
		    	    driver.navigate().back();
		     }
		     
	     }
	     
	     
	     

}
}