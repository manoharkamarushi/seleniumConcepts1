package selenium_learnAutomation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.BeforeTest;

public class PatternMatcher {

public String s="selenium & testng_framew0rk_!@$";
  @Test(enabled=false)
  public void f() {
//	  any spl chars ?
	  
	  Pattern p=Pattern.compile("[^0-9 a-z]",Pattern.CASE_INSENSITIVE);
	  Matcher m=p.matcher(s);
	  
	  if(m.find()){
		  System.out.println("spl characters found");
	  }
	  else
		  System.out.println("not found");
  }
  
  @Test(enabled=false)
  public void count() {
	  int count=0;
	  for(int i=0;i>=s.length();i++){
	  
	  char c=s.charAt(i);
	  Pattern p=Pattern.compile("[^0-9 a-z]",Pattern.CASE_INSENSITIVE);
	
	  Matcher m=p.matcher(c+" ");
	  
	  if(m.find())
		   { System.out.println("found,count:"+count);
		     count++;
		     }
	  else
	  { System.out.println("not found");}
  	  
	  }
  }
  @Test
  public void separate(){
	  String s1="manASohar55844";
	  ArrayList<String> op=new ArrayList<String>();
	  
	  Pattern p=Pattern.compile("[0-9]");
	  Matcher m=p.matcher(s1);
	  
	  while(m.find()){
		op.add(m.group());  
	  }
	  for(String s2:op){
		  System.out.print(s2);
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  	  
  }

}
