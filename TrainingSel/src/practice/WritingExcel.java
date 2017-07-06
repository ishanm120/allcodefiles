package practice;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws Exception {

		File src = new File(System.getProperty("user.dir") + "\\testData.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("Records");

		for (int i = 0; i <= 25; i++) {

			sheet.createRow(i).createCell(0).setCellValue("Name");
			sheet.getRow(i).createCell(1).setCellValue("class");
			FileOutputStream fos = new FileOutputStream(src);
			wb.write(fos);

		}
		System.out.println("Sheet Created Successfully");
		wb.close();
	}

}
