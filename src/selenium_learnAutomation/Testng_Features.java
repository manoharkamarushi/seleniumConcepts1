package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
//@Listeners(Mylisteners.class)
public class Testng_Features {
 
@Test(
dataProvider = "dp", 
dataProviderClass=Annotations_1Factory.class,// no need to use data provider in the same class
// from another class too we can it
groups={"regression","smoke"},
dependsOnMethods={"login"},
dependsOnGroups={"groupname_1","groupname_2"},
enabled=true,
priority=1,
alwaysRun=true,
description="description for this test method",
expectedExceptions={IOException.class,NullPointerException.class},
// it test method contains other than this exceptions ,test method fails
timeOut=30000,//max no.of millisec to run this test.30sec
testName="test1", // only tests defined in <test> tag matching one of these names will be run.
successPercentage=90 //The percentage of success expected from this method)
//ignoreMissingDependencies
)
//-------------------------------------------------------------
//  Hard dependncy --if a method depends on dependsOnMethods,dependsOnGroups failed... that methods will be skipped.
// alwaysRun runs, if the invoked methods fails/skipped also.
// Soft dependency -- acheieved if alwaysRun=true
  public void f(Integer n, String s) {
  }
  
  @Test(invocationCount=4,invocationTimeOut=20000,threadPoolSize=10)
//  threadpoolsize used along with invocation count...here this test method will execute 4 times 
//  using 10 threads...speedy execution..
  public void f1(){
	  
  }
  
//  @Listeners(classname.class)
  @Test
  public void samplelistener(){
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }


  @DataProvider(parallel=true) //by defualt false  
  public Object[][] dp() {
	  
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
 
  
  @BeforeClass
  public void beforeClass() {
  }
  
  @Parameters("browser")
  @BeforeTest(alwaysRun=true,enabled=true)
  public void beforeTest(@Optional("firefox") String browser) {
//  this optional annotation ,by defeualt assigns to browser , if didnt send browser name through 
//	  parameters
  }

  @BeforeSuite
  public void beforeSuite() {
  }

}
