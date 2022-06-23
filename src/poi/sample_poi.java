package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class sample_poi {
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	@Test
	public static void poi() throws Exception{
		
		File f=new File("F:\\TESTING BASICS\\mindq_selinium\\MANOHAR_DOCS\\sudha_poi\\poi_sample.xlsx");
		System.out.println("------"+f+"---------");
		
			FileInputStream fin=new FileInputStream(f);
			System.out.println(fin);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheetAt(0);
			
			int rowcount=sh.getLastRowNum();//-sh.getFirstRowNum();
			System.out.println("total_rows:"+rowcount+"----");
			//System.out.println(sh.getActiveCell());
			
			int rowcount1=sh.getLastRowNum()-sh.getFirstRowNum();
			
			for (int i = 0; i < rowcount1+1; i++) {
				Row row = sh.getRow(i);
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		 	            System.out.print(row.getCell(j)+"|| ");
		 	 
		        }
		        System.out.println("\n");
		     }
			System.out.println("Read excel is successfull");
		
					
	}//method
	
	@Test
	public static void writeExcel() throws Exception{ 
		File f=new File("F:\\TESTING BASICS\\mindq_selinium\\MANOHAR_DOCS\\sudha_poi\\poi_sample.xlsx");
		FileInputStream fin=new FileInputStream(f);
		wb=new XSSFWorkbook(fin);
		sh=wb.getSheetAt(0);
		//Create a new row and append it at last of sheet
		int rowcount=sh.getLastRowNum();
		//Get the first row from the sheet
       Row row = sh.getRow(0);
       Row newRow = sh.createRow(rowcount+1);
       String dataToWrite[]={"syam","ram","momu"};
           for(int i=0;i<row.getLastCellNum();i++){
        	   Cell cell = newRow.createCell(i);
               System.out.println(dataToWrite[i]);
               cell.setCellValue(dataToWrite[i]);
        
        	   
           }
     
           fin.close();

           //Create an object of FileOutputStream class to create write data in excel file
        
           FileOutputStream outputStream = new FileOutputStream(f);
           wb.write(outputStream);
           outputStream.close();

	}
		
}//class
