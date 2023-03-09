package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_ShotMethod3 {
	static WebDriver driver;//driver blue color indicate class variable
	
	private static void screenShot(String s) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;//driver class variable
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\amazon\\"+s+".png");
        FileUtils.copyFile(screenshotAs, f);		

	}
	
	public static void main(String[] args) throws IOException, Throwable {
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		screenShot("facebook");
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		screenShot("instagram");
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		screenShot("google");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
