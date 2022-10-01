package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;


public class Fileridu2 {

	public static void main(String[] args) throws IOException {


		String filepath = "C:\\Users\\LENOVO\\Desktop\\testing.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("statedata");
		int rowcount = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		int cellcount = row.getLastCellNum();
		
		for(int i=0;i<=rowcount;i++) {
			row =sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch(type)
				{
				case STRING : 
					System.out.print(cell.getStringCellValue());break;
				case NUMERIC:
					int data = (int) cell.getNumericCellValue();
					System.out.print(data);break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
