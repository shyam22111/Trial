package Selenium.ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		AutomationPractice ob = new AutomationPractice();
		ob.InitialiseBrowser();
		driver.close();		
		}
	public static void ScreenShotDynamic() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		String fname1 = "screen"+date.toString().replace(" ",".").replace(":", "_")+".jpeg";
		File Destination = new File("C:\\Users\\Shyam\\OneDrive\\Desktop\\ProjectLibrary\\ProjectRelated\\ScreenShot\\Practice\\"+fname1);
		FileUtils.copyFile(src, Destination);
	}
	public void InitialiseBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> fimg = driver.findElements(By.xpath("//a[@class='product_img_link']/img"));
		for(int i=0;i<fimg.size();i++) {
			List<WebElement> fimg1 = driver.findElements(By.xpath("//a[@class='product_img_link']/img"));
			String elemt = fimg1.get(i).getAttribute("src");
			driver.get(elemt);
			ScreenShotDynamic();
	
			driver.navigate().back();
		}
	}
	
	
}
