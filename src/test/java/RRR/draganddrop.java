package RRR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		     WebDriver driver = new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.get("https://testautomationpractice.blogspot.com/");
		           Actions drop =new Actions(driver);
		     WebElement source =driver.findElement(By.id("draggable"));
		     WebElement destination = driver.findElement(By.id("droppable"));
		     drop.dragAndDrop(source, destination).build().perform();
	}

}
