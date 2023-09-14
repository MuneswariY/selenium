package TestNG;

 import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excellogin1  {

    @Test(dataProvider = "TestData")
    public void table(String username, String password) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://poojastore.marolix.com/Authenticate/Login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        driver.findElement(By.name("emailid")).sendKeys(username);
        driver.findElement(By.name("pword")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();

        String url=driver.getCurrentUrl();
        assertEquals("http://poojastore.marolix.com/",url );
        driver.quit();
    }
    
@DataProvider(name = "TestData")
    public Object[][] provideTestData() throws Throwable  {
        FileInputStream file = new FileInputStream("C:\\Users\\C Prompt\\eclipse-workspace\\RRR\\target\\EXCELTASK.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);

        int lastRow = sheet.getLastRowNum() ;
        int lastColumn = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[lastRow][lastColumn];

        for (int i = 0; i < lastRow; i++) {
            for (int j = 0; j < lastColumn; j++) {
                data[i][j] = sheet.getRow(i).getCell(j).toString();
            }
        }

        wb.close();
        file.close();

     
		return data;
    }
}
  
	


