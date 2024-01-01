package com.beforeannotation;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotationBeforeSuite {
	@Test
	public void beforeMethod(){
		System.out.println("before");

	}
	
	@BeforeSuite// test method will  executed before all the test method in that folder
	public void testMethodOne(){
		System.out.println("testmethodone");
	}
	
	@Test
	public void testMethodTwo(){

		System.out.println("testmethodtwo");

	}

}
