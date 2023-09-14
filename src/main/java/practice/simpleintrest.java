package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simpleintrest {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
               driver.get("https://groww.in/calculators/simple-interest-calculator");
               WebElement intrest = driver.findElement(By.id("PRINCIPAL_AMOUNT"));
                 
	}

}
