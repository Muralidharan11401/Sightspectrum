package excelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchExcelData {
	
	
	public static void  main(String[] args) throws IOException {
		
		//FileInputStream excel = new FileInputStream("C:\\Users\\SSLTP11251\\Desktop\\Datadriven.xlxs");
		
		
		String fileLocation = "./TestData/Datasource.xlsx";
		
		
		XSSFWorkbook book = new XSSFWorkbook(fileLocation);
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		for (int i = 1; i <=2; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		
		book.close();
		
		
	}
	
	
	
	
	

	//public static void main(String[] args) {
		

	//}

}
