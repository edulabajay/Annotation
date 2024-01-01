package com.beforeannotation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotationBeforeMethod {
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before");
	}
	@Test
	public void testMethodOne(){
		System.out.println("testmethodone");

	}
	@Test
	public void testMethodTwo(){

		System.out.println("testmethodtwo");

	}

}
