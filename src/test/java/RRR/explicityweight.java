package RRR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicityweight {

	private static int i;

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver =new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(25));
	            
	            
	            String[] elementid = {"h2", "hidden", "disable", "ch",}; 
	              
	              String[] buttonid = {"populate-text", "display-other-button", "enable-button", "checkbox",};

	            		
	            
	            
	              for (int i = 0; i < elementid.length; i++) {
	                  
	                  driver.findElement(By.id(buttonid[i])).click();
	                 // Thread.sleep(10000);
	                  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementid[i])));
	                // Thread.sleep(2000);
	               
	                  System.out.println(driver.findElement(By.id(elementid[i])).getText());
	              }
	               
	               

	}

}
