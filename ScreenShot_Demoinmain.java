package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Demoinmain {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;//downcasting
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\Google\\kams.png");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
		
		
		
		
		
	}

}
