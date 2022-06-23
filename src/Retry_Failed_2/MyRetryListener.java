package Retry_Failed_2;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class MyRetryListener implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation testannotation,
			Class testClass,
			Constructor testConstructor, 
			Method testMethod)	
			{
		
		IRetryAnalyzer r = testannotation.getRetryAnalyzer();

		if (r == null)	{
			testannotation.setRetryAnalyzer(Retry.class);
							}//if

	}//transform
}//class
