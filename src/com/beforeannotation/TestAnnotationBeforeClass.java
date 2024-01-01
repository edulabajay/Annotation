package com.beforeannotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnnotationBeforeClass {
	@Test
	public void beforeMethod(){
		System.out.println("before");
	}
	@BeforeClass
	public void testMethodOne(){
		System.out.println("testmethodone");

	}
	@Test
	public void testMethodTwo(){
		System.out.println("testmethodtwo");
	}
}
