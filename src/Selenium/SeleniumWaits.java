package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	
	   
	   
	   public static void main(String[] args) {
		   SeleniumWaits ob= new SeleniumWaits();
		   ob.ABC("exicute");
		   
    	}
	  public void ABC(String string) {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			String URL = "https://omayo.blogspot.com/";
	        driver.get(URL);
	        
	        
	       WebElement MrOption = driver.findElement(By.xpath("//input[@id='dte']"));
	       // Waiting element 10 sec
	       
	       if(MrOption.isEnabled()) {
	    	   MrOption.click();
	       } else {
	    	   System.out.println("Element is not enebled");
	    	   WebElement clickThis = driver.findElement(By.xpath("//button[text()='Check this']"));
	    	   clickThis.click();
	    	   WebDriverWait wait = new WebDriverWait(driver, 10);
	    	   WebElement mroption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
		       mroption.click();
		       
		       System.out.println("Element is clicked after 11 sec");
		       driver.close();
	       }
	       
	        
	}
    

	}

