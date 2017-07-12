package pageObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcelii {

 public static void main(String[] args) throws BiffException, IOException {
  File file = new File("C:\\Users\\Ishan\\Desktop\\test.xls");
  if(!file.exists()){
   file.createNewFile();
  }
        Workbook owb= Workbook.getWorkbook(file);
        Sheet ost= owb.getSheet("Sheet1");
        int rows = ost.getRows();
        int columns = ost.getColumns();
        String input[][]= new String[rows][columns];
        for(int i = 0;i<rows ;i++)
        {
         for(int j = 0;j<columns ;j++)
         {
          Cell c= ost.getCell(j, i);
          input[i][j]=c.getContents();
          System.out.println(input[i][j]);
         }
        }
 }

}