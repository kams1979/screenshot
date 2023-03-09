package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotwebDriverElementsMethod {
	static WebDriver driver;
	
	private static void Screen1(String b) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\Insta\\"+b+".png");
	    FileUtils.copyFile(screenshotAs, f);
      
	}
	
	public static void main(String[] args) throws IOException, Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.name("email"));
		element.sendKeys("kamatchi_rajarun@yahoo.co.in");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("butterfly1979");
		WebElement element3 = driver.findElement(By.xpath("//button[@value='1'][1]"));
		element3.click();
		Thread.sleep(6000);
		Screen1("facebook");
		
		
		
		
		
		
		
		
		
		
		
	}
}


