package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleScreenShot {
	static WebDriver driver;
	
	private static void screens3(String f) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File p=new File("C:\\Users\\Kavin\\eclipse-workspace\\Selenium\\screens\\"+f+".png");
		FileUtils.copyFile(screenshotAs, p);
	
		
		

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.com//");
		driver.get("https://www.facebook.com//");
		WebElement element = driver.findElement(By.name("email"));
		element.sendKeys("kamatchi_rajarun@yahoo.co.in");
		//screens3("amazon");
		WebElement element2 = driver.findElement(By.name("pass"));
		element2.sendKeys("butterfly1979");
		WebElement element3 = driver.findElement(By.xpath("//button[@value='1'][1]"));
		element3.click();
		Thread.sleep(2000);
		screens3("facebook");
	}

}
