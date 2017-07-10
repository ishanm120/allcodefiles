package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File(System.getProperty("user.dir") + "\\testData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//XSSFSheet sheet1 = wb.getSheetAt(0);
		XSSFSheet sheet1 = wb.getSheet("Records");
		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(colCount);
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String data = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
				System.out.print(" :  ");
			}
			System.out.println("");
		}
		
		wb.close();
	}

}

