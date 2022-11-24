package WaitPractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	
	 public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                   .withTimeout(Duration.ofSeconds(30))
				                   .pollingEvery(Duration.ofSeconds(5))
				                   .ignoring(NoSuchElementException.class);
		                            
		 
		 
		 FluentWait<WebDriver> wait2 =new FluentWait<WebDriver>(driver)
				                          .withTimeout(Duration.ofSeconds(30))
				                          .pollingEvery(Duration.ofSeconds(5))
				                          .ignoring(NoSuchElementException.class);
		 
		 
		 
		 WebDriverWait wait3 = new WebDriverWait(driver, 20);
		               wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath"))).click();
		 
		               
		               
		               
		               
		               
		               
	}
}
