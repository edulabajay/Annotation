package com.beforeannotation;
//@BeforeTest: The method which comes under the @BeforeTest annotation will be executed first before any test belonging to that folder.
/*
@BeforeSuite: The annotated method will be run before all tests in this suite have run.
@AfterSuite: The annotated method will be run after all tests in this suite have run.
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
@BeforeMethod: The annotated method will be run before each test method.
@AfterMethod: The annotated method will be run after each test method.*/

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationBeforeTest {
	@Test
	public void beforeMethod(){
		System.out.println("before");
	}
	@BeforeTest
	public void testMethodOne(){
		System.out.println("testmethodone");

	}
	@Test
	public void testMethodTwo(){
		System.out.println("testmethodtwo");
	}
}
