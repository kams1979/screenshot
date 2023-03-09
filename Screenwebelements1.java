package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenwebelements1 {
	static WebDriver driver;
	private static void screen(String c) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Kavin\\eclipse-workspace\\ScreenShotDemo\\amazon\\."+c+".png");
		FileUtils.copyFile(screenshotAs, f);

	}
public static void main(String[] args) throws IOException, InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().fullscreen();
	Dimension d= new Dimension(800,800);
	driver.manage().window().setSize(d);
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.switchTo();
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.manage().deleteAllCookies();
	screen("facebook");
	Thread.sleep(4000);
	screen("instagram");
	driver.quit();
	
	
}
}
