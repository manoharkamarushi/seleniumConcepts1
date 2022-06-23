package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyPOI {
static XSSFWorkbook wb;
static XSSFSheet sheet;

public static void readExcelFile(String excelpath) throws FileNotFoundException, IOException{

	wb=new XSSFWorkbook(new FileInputStream(new File(excelpath)));
}

public static String readData(int sheetindex,int row,int col){
	String data=wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	return data;
}
public static int rowCount(int sheetindex){
	int rows=wb.getSheetAt(sheetindex).getLastRowNum();
	return rows+1;
}



public static void main(String[] args) throws FileNotFoundException, IOException{
	MyPOI obj=new MyPOI();
//	


}	
}
