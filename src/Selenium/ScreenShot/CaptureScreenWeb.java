package Selenium.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenWeb {
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		CaptureScreenWeb myfriend = new CaptureScreenWeb();
		myfriend.InitializeBrowser();
		myfriend.goDaddy();
		myfriend.flipCart();
		myfriend.PolicyBazaar();
		myfriend.RedBus();
		myfriend.SpaceX();
		myfriend.VCTC();
		driver.close();
		
	}
	
	
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	public void ScreenShot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\StaticScreenShot\\ScreenCapture.png");
 		FileUtils.copyFile(src, destination);
	}
	public void ScreenShot(String dynamic) throws IOException {
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    // screenshot taken attach time before saving
		Date date = new Date();
		String fname = "screen"+date.toString().replace(" ", "_").replace(":",".")+".png";
        File destination1 = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\Practice\\"+fname);
	    FileUtils.copyFile(src1, destination1);
	}
	
	public void goDaddy() throws IOException {
		driver.get("https://www.godaddy.com/en-in");
		ScreenShot("dynamic");
		
	}
	
	public void PolicyBazaar() throws IOException {
		driver.get("https://www.policybazaar.com/");
		ScreenShot("dynamic");
		
	}

    public void flipCart() throws IOException {
    	driver.get("https://www.flipkart.com/");
		ScreenShot("dynamic");
		
	}
    
    public void VCTC() throws IOException {
    	driver.get("https://vctcpune.com/");
		ScreenShot("dynamic");
		
	}
    
    public void SpaceX() throws IOException {
    	driver.get("https://www.spacex.com/");
		ScreenShot("dynamic");
	}
    
    public void RedBus() throws IOException {
    	driver.get("https://www.redbus.in/bus-tickets");
		ScreenShot("dynamic");
		
	}
    
}
