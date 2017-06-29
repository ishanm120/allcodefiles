package testNG_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practice {

	public static void main(String[] args) throws IOException {
		File src = new File("E:\\wv_training\\test_data\\practice.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		for (int i = 0; i <= 3; i++) {
			XSSFRow row=    sheet1.createRow(i);
			for (int j = 0; j < i; j++) {

				row.createCell(j).setCellValue(i + "   " + j);
				
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
			}

		}
	}
}
