package DDF;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferentClass extends Simple_DDF{
  
// by defualt,dataprovider searches for the same class or base class...
//  if other than this we need to specify the class name...
 
  @DataProvider(name="createdata")
  public Object[][] sendData1(){
	  
	  return new Object[][]{
		  
		  {"selnium","2.0"},
		  {"HpAlm","12.0"},
	  };
	  
  }
  
  @DataProvider(name="dp")
  public Object[][] create(){
  	
  	Object[][] data=new Object[2][2];
  			   
  	data[0][0]="selenium";
  	data[0][1]="2.0";
  	data[1][0]="AutoIT";
  	data[1][1]="3.3";
  	
//  data[2][0]="s";
  	
  	
  	
  	return data;
  	
  }
  
  @DataProvider(name="d1")
  public String dfjdkf(){
	
	  String data="";
	  
	  return data;
	  
  }
  
  @Test(dataProvider="d1")
  public void fd(String name){
	  
	  System.out.println(name);
  }
}
