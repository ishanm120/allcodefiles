package testNG_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	
	@Test
	void Reading() throws Exception{
		File src = new File("E:\\wv_training\\test_data\\Testng-test.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);

		for (int i = 0; i <= 25; i++)
		{
			while (i <= 5 && i <= 10) 
			{
				System.out.println("fail");
			}
			for (int j = 0; j < 1; j++) 
			{
             	sheet1.createRow(i).createCell(0).setCellValue("Pass");
				sheet1.getRow(i).createCell(1).setCellValue("fail");
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
				System.out.print("      ");
			}
			System.out.println("");
		}
		wb.close();
	}

}
