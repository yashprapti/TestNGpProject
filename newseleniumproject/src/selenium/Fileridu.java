package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;


public class Fileridu {

	public static void main(String[] args) throws IOException {


		String filepath = "C:\\Users\\LENOVO\\Desktop\\testing.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("userdata");
		/*
		 * XSSFRow row = sheet.getRow(1); XSSFCell cell = row.getCell(1);
		 */
		
		//int data = (int) cell.getNumericCellValue();
		int data = (int) sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(data);
	}

}
