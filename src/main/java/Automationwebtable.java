import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationwebtable {

	private static WebElement cell;

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://cosmocode.io/automation-practice-webtable/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		  WebElement table = driver.findElement(By.id(".//table[@id=countries"));
		       List<WebElement> rows=table.findElements(By.xpath(".//table[@id='countries']//tr"));
          for(WebElement row :rows) {
            	 List<WebElement> columns = row.findElements(By.xpath(".//td"));
            	 
            	 for(WebElement column:columns) {
            	System.out.println(cell.getText());	
            	String value =cell.getText();
            			
            			 if(value.equals("Togo"));
            		 WebElement CheckBOX = row.findElement(By.xpath(".//input[@class='CheckBox'"));
            		 CheckBOX.click();
            		 break;
            		 
            	 }
             }
            	 
             
             
             
	}

}
