package RRR;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RRR {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		   driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=343337977031836737&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		  WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		           search.sendKeys("iphone");
		           
		           
	 List<WebElement>  search1=driver.findElements(By.xpath(" // div[@class='s-suggestion-container']//span"));
		      
	 
	           for(int i=0;i < search1.size();i++ ) {
	        	 if (search1.get(i).getText().contains("12")) {
	        		 search1.get(i).click();
	        		 break;
	        	 }
	        	       
	        	     
	           }
	                 
		                 
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		      

	}

}
