package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen20 {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\amazon\\ritu.png");
		FileUtils.copyFile(screenshotAs, f);
		
	}
	
	

}
