package Selenium.ReadTableFromWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutualFundTable {
    public static WebDriver driver;
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	     driver=new ChromeDriver();
	     
	     driver.get("https://money.rediff.com/mutual-funds");
	     
	     int allrows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
	     int allCols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]//td")).size();
	   
	     
	     for(int i=1;i<=allrows;i++) {
	    	 for(int j=1;j<=allCols;j++) {
	    		 String fFund = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]//td["+j+"]")).getAttribute("innerText");
	    		 System.out.print(fFund+"=");
	    	 }
	    	 System.out.println();
	     }

	}

}
