package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createWorkbook {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook= new XSSFWorkbook();
		FileOutputStream fos= new FileOutputStream(new File("sample.xlsx"));
		workbook.write(fos);
		fos.close();
		System.out.println("Sheet created successfully");
		
		
	//	Reading Excel book
		
		/*
		File file= new File("E:\\wv_training\\sel_training\\sample.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook workbook1= new XSSFWorkbook(fis);
		XSSFSheet sheet1=workbook1.createSheet("Sample1");
		System.out.println("Sheet created successfully");*/
		

	}
	
	


	
	
}
