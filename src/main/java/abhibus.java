import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class abhibus {

	public static void main(String[] args) throws Throwable {
	      WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	             driver.get("https://www.abhibus.com/");
	             Actions ac =new Actions(driver);
	              int day=25;
	             WebElement search =driver.findElement(By.id("source"));
	                    search.sendKeys("kadapa");
	                   Thread.sleep(2000); 
	              WebElement search1= driver.findElement(By.id("ui-id-1")); 
	                       ac.moveToElement(search1).click().build().perform();
	              WebElement search2 =driver.findElement(By.id("destination"));
	                        search2.sendKeys("vijayawada");
	                        Thread.sleep(2000);
	                WebElement search3 =driver.findElement(By.id("ui-id-2"));
	                     ac.moveToElement(search3).click().build().perform();
	              WebElement search4 =driver.findElement(By.id("datepicker1")) ;
	               WebElement search5=driver.findElement((By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()="+day+ "]")));
	                          search4.click();
	                          Thread.sleep(2000);
	               		  ac.moveToElement(search5).click().build().perform();       
	               WebElement search6 =driver.findElement(By.xpath("//a[@onclick='javascript:validateSearch();']"));
	                          ac.moveToElement(search6).click().build().perform();
	                         
	}
	                                 
	                       
	                           
	                  
                       


	}


