package DDF;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Simple_DDF {
	
  @Test(dataProvider="testname",enabled=false)
  public void getData(String name,String no) {
	  
	  System.out.println(name+" "+no);
  }
  
  @DataProvider(name="testname")
  public Object[][]  sendData(){
	
	  return new Object[][]{
		
		{"john","20"},
		{"clric","35"},
		
	};  }
 
  @Test(dataProvider="createdata",dataProviderClass=DifferentClass.class,enabled=false)
  public void getData1(String name,String version){
	  
	  System.out.println(name+": "+version);
	  
  }


@Test(dataProvider="dp",dataProviderClass=DifferentClass.class)
public void arraydata(String s1,String s2){
	
	System.out.println(s1+"  "+s2);
	
}



}


