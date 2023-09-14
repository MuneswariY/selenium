package RRR;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		   // WebDriverManager.chromedriver().setup(); 
	     WebDriver driver =new ChromeDriver();
	          driver.get("https://www.youtube.com/");
	                        
	          File sourceFile = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	               File destfile = new File("C:\\Users\\C Prompt\\Pictures\\Screenshots/image1.jpg");
	                   
	              FileUtils.copyFile(sourceFile, destfile);

	}

}
