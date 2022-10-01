package webelements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;


public class ExcelReader {

	public static void main(String[] args) throws IOException {

		String filepath = ".\\Resources\\testing.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("userdata");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		int data = (int) cell.getNumericCellValue();
		System.out.println(data);
	
	}

}
