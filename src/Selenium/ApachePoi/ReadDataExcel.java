package Selenium.ApachePoi;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "http://automationpractice.com/index.php";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys(getValue(1, 1));
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		Pass.sendKeys(getValue(2, 1));
		
		WebElement Submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		Submit.click();
		
		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
		signOut.click();
		driver.close();

	}
	
	public  static String getValue(int a,int b) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Shyam\\OneDrive\\Desktop\\TestData.xlsx");
		String Value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		return Value;
		
		
	}

}

