package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.Reporter;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Excel {

	public static FileInputStream fin;
	public static Workbook wb;
    public static Sheet sh,wsh;
	public static String filename="E:\\work space\\SELENIUM2\\Selenium_Concepts_NEW\\src\\DDF\\testdata.xls";

public static void createConnection(){
	
	try {
		fin=new FileInputStream(new File(filename));
		Reporter.log("created fin instance", true);
		wb=Workbook.getWorkbook(fin);
		Reporter.log("created workbook instance", true);
		sh=wb.getSheet(0);
		Reporter.log("created sheet instance", true);
		
	} catch (BiffException e) {
		Reporter.log("exception Raised related to excel file", true);
		System.out.println(e);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
	}
public static int rowcount(){
	
	return sh.getRows(); 	
}

public static int colcount(){
	
	return sh.getColumns();
}

public static String readcelldata(int cno,int rno){
	
	return sh.getCell(cno,rno).getContents();
}


public static Object[][] readdata1() throws BiffException, IOException{
	  
	wb=Workbook.getWorkbook(fin);  
	sh=wb.getSheet(0);
	
	int colcount=sh.getColumns();  
	System.out.println(colcount);
	
	int rowcount=sh.getRows(); 
	System.out.println(rowcount);

	String[][] data=new String[colcount][rowcount];
	
	for(int c=0;c<colcount;c++){
		for(int r=0;r<rowcount;r++){
				data[c][r]=sh.getCell(c,r).getContents();
				
		}
	}
	return data;
  }	
	
}


