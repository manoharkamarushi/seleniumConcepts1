package DDF_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mukesh_poi{	
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	String fpath="";
	static FileInputStream fin;
		
	{
		try {
			fin=new FileInputStream(new File(fpath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb=new XSSFWorkbook(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public static String getData(int shno,int row,int col){
		
		sh=wb.getSheetAt(shno);
		String data=sh.getRow(row).getCell(col).getStringCellValue();
		
		return data;
		
					}
	
	public static int getrowcount(int shno1){
		
		
		return (wb.getSheetAt(shno1).getLastRowNum())+1;
	}
	
}


