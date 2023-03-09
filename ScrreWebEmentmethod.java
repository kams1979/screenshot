package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrreWebEmentmethod {
	static WebDriver driver;
	private static void method1(String a) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;//driver class variable
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\amazon\\"+a+".png");
        FileUtils.copyFile(screenshotAs, f);

	}
		public static void main(String[] args) throws Throwable {
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Dimension d = new Dimension(600,600);
			driver.manage().window().setSize(d);
			WebElement element = driver.findElement(By.name("email"));
			element.sendKeys("kamatchi");
			Thread.sleep(3000);
			String attribute = element.getAttribute("name");
			System.out.println(attribute);
			method1("facebook");
			driver.quit();
			
		}
	}


