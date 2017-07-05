package testNG_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConnectDBOne {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	@Test(dataProvider = "logindata")
	public static void main(String []id)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "root");
		mainMethod(id[0], id[1], id[2], id[3], id[4],con);
	}

	
	
	public static void mainMethod(String id, String name, String profile, String project, String salary, Connection con) throws ClassNotFoundException, SQLException {
		
		Statement smt = con.createStatement();
		String queryStatement = "INSERT INTO WebEmp VALUES ( id + ",'" + name + "','" + profile + "','" + project + "'," + salary )";


		smt.execute(queryStatement);
	} 

	
	
	
	
	
	
	@DataProvider(name = "logindata")

	public Object[][] testData() throws Exception {

		DataProviderExcel("E:\\allcodefiles\\sel_training\\records.xlsx");

		int rows = getRowCount(0);
		int cols = getColCount(0);

		Object[][] data = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				data[i][j] = getData(0, i, j);

			}
		}
		return data;
	}

	public static XSSFWorkbook DataProviderExcel(String path) throws Exception {

		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

		return wb;

	}

	public static String getData(int sheetindex, int row, int col) throws IOException {

		sheet = wb.getSheet("emp");
		XSSFCell cell = sheet.getRow(row).getCell(col);
		System.out.println("row:: " + row + " col:: " + col + " == cell found:: " + cell);
		CellType data = cell.getCellTypeEnum();

		switch (data) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return cell.getNumericCellValue() + "";
		default:
			throw new IllegalArgumentException("Invalid cell type ");
		}
	}

	public static int getRowCount(int sheetindex) {

		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row + 1;
		return row;
	}

	public static int getColCount(int sheetindex) {

		int Col = wb.getSheetAt(sheetindex).getRow(0).getLastCellNum();

		return Col;
	}

}
