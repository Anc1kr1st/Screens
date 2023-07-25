package screenshot.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}
	public void failed()
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("/C:/Users/The God/eclipse-workspace/Screens/" + "ScreenshotsTaken/TestCasesFailed.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
