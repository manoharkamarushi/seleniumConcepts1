package selenium_learnAutomation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_1Factory {
	
	String param="";
	
	public Annotations_1Factory(String param){
		this.param=param;
	}
	
  @Test
  public void f() {
	  System.out.println("test-annotaion_1");
	  
  }
 
  @BeforeClass
  public void init(){
	System.out.println(" before class :annotation_1");  
	  
  }
  
  
}
