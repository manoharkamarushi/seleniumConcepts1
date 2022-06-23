package selenium_learnAutomation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

@Test
public class Annotations_sample1 {
	
/*anotations execution order:
--------------
BeforeSuite
BeforeGroups
BeforeTest
BeforeClass
BeforeMethod
@Test
AfterMethod
AfterClass
AfterTest
AfterGroups
AfterSuite*/

@Test(invocationCount=2,testName="sample")
public void sample(){
	
	System.out.println(" sample test method");
}


public void sample1(){
	 
System.out.println("sample1");	 
 }
 
 @BeforeTest
 public void bt(){
	 System.out.println("before test");
 }
}
