package selenium_learnAutomation;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class Multiple_xml_Files_Using_Java {
  
	public static void main(String[] args){
		
//		create an object for testng class
		TestNG tstng=new TestNG();
//	create a list to add xml files you want to execute
		List<String>suitefiles=new  ArrayList<String>();
					
					suitefiles.add("path of xml file");
					suitefiles.add("path of xml file");
//					.....
//now set xml files for execution using setTestSuites()
		tstng.setTestSuites(suitefiles);

//now run the suitefiles using run()
		tstng.run();
		
		
	}
}
