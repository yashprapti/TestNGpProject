package webelements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws IOException {
		String filepath = ".\\Resources\\testing.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("statedata");
		int rowcount = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		short cellcount = row.getLastCellNum();

		for(int i=0;i<=rowcount;i++) {
			row = sheet.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell = row.getCell(j);
				CellType datatype = cell.getCellType();
				switch(datatype) {
				case STRING :
					String cellval = cell.getStringCellValue();
					System.out.print(cellval);
					break;
				case NUMERIC :
					int cellval1 = (int) cell.getNumericCellValue();
					System.out.print(cellval1);
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
