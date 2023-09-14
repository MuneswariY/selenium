
package practice;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.debugger.model.BreakLocation;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Webtable1 {

 
	public static void main(String[] args) throws Throwable {
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
         
        JavascriptExecutor je =(JavascriptExecutor)driver;
         je.executeScript("window.scrollBy(0,100)"); 
         
        WebElement table = driver.findElement(By.id("countries"));
        List<WebElement> rows = table.findElements(By.xpath("//table[@id='countries']//tr"));
        
       for (int i = 1; i <= rows.size(); i++) {
        	
        	List<WebElement> columns = rows.get(i-1).findElements(By.xpath(".//td"));
        	
              for (WebElement column : columns) {
                String countryName = column.getText();
                System.out.println(countryName);

            if (countryName.equals("Japan")) {
            WebElement countrybox = rows.get(i-1).findElement(By.xpath( ".//input[@class='hasVisited']"));
            countrybox.click();
                
                 
                   }
              }
        }
	}

}
		
	




				
		



	


