package RRR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
          WebElement field1 =  driver.findElement(By.xpath("//input[@id='field1']"));
               field1.clear();
               field1.sendKeys("welcome");
               WebElement button  = driver.findElement(By.xpath("<button ondblclick=\"myFunction1()\">Copy Text</button>"));
              Actions field=new Actions(driver);
                
				field.doubleClick(button).perform();
	}

}
