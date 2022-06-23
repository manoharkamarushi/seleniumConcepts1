package testng_through_Java;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import Retry_Failed_2.MyTests;

public class RunTestNG {

	/*TestListenerAdapter tla = new TestListenerAdapter();
	TestNG testng = new TestNG();
	testng.setTestClasses(new Class[] { Run2.class });
	testng.addListener(tla);
	testng.run(); */
	
	/* 
	XmlSuite suite = new XmlSuite();
	suite.setName("TmpSuite");
	 
	XmlTest test = new XmlTest(suite);
	test.setName("TmpTest");
	
	List<XmlClass> classes = new ArrayList<XmlClass>();
	classes.add(new XmlClass("test.failures.Child"));
	test.setXmlClasses(classes) ;
	
	And then you can pass this XmlSuite to TestNG:
	
	
	List<XmlSuite> suites = new ArrayList<XmlSuite>();
	suites.add(suite);
	
	TestNG tng = new TestNG();
	tng.setXmlSuites(suites);
	tng.run();*/

}
