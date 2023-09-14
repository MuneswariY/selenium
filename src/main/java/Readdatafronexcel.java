

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafronexcel {

	

	


	public static void main(String[] args) throws Throwable {
		FileInputStream File = new FileInputStream("C:\\Users\\C Prompt\\eclipse-workspace\\RRR\\target\\EXCELTASK.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet sheet = wb.getSheetAt(0);
		 int lastRow = sheet.getLastRowNum();
	        int lastColumn = sheet.getRow(0).getLastCellNum();
	        
	        
	        for (int i = 0; i <= lastRow; i++) {  
	            

	            for (int j = 0; j < lastColumn; j++) { 
	               
	              System.out.println(sheet.getRow(i).getCell(j));  
	               
	               
	                
	               
		 
		 
	               
		      
		   
	            
		   
	            }
	            }
	}

}
