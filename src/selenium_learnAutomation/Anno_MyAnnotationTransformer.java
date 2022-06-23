package selenium_learnAutomation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

/*public class Mytest {
	  @Test(invocationCount = 10)
	    public void verify() {
	    // ...
	  }}
	  
If I want to override this value at runtime, I find myself having to write a
 fairly complex piece of XML code in order to pinpoint the exact annotation 
 I'm trying to override.  It would probably look like this:
 
<override-annotation>
  <package name="org.foo.tests">
    <class name="MyClass">
      <method name="verify">
        <annotation name="org.testng.Test">
          <attribute name="invocationCount" value="15" />
        </annotation>
      </method>
    </class>
  </package>
</override-annotation>*/

public class Anno_MyAnnotationTransformer extends Annotations_sample1 implements IAnnotationTransformer {
 
@Override
public void transform(
		ITestAnnotation annotation, 
		Class testClass, 
		Constructor testConstructor,
		Method testMethod) {

	
	if("sample".equals(testMethod.getName())){
	
		annotation.setInvocationCount(3);
		annotation.setTestName("login");
		annotation.setAlwaysRun(true);
	
		
	}
	System.out.println(testClass.getAnnotations());
	
}
}
