package selenium_learnAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.Factory;

public class Annotation_Factory {
  
@Factory
public Object[] sample(){
	
	
	return new Object[] {
		
		new Annotations_1Factory("one"), 
		new Annotations_1Factory("two")
	};
	
}
}
