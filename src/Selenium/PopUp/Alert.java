package Selenium.PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebElement but = driver.findElement(By.xpath("//input[@type='button']"));
		
		but.click();
		
	     org.openqa.selenium.Alert al = driver.switchTo().alert();
	     al.getText(); // can not inspect
	     System.out.println(al.getText());
	     al.accept();
	     
	     
	     
	     
		    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		    
		    String secondWindo = driver.getWindowHandle();
		    driver.switchTo().window(secondWindo);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		   WebElement iframecomponent = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		   driver.switchTo().frame(iframecomponent);
		   WebElement tryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		   tryitBtn.click();
		   Thread.sleep(2000);
		    org.openqa.selenium.Alert al2 = driver.switchTo().alert();
		   String textfromPopup = al2.getText();
		   System.out.println(textfromPopup);
		   al2.accept();
		
		
		

	}

}
