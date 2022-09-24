package com.junit.features;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnnotationsTest {

	@Test
	public void test1() {
		System.out.println("test data1");
	}
	@Test
	public void test2() {
		System.out.println("test data2");
	}
	@Test
	public void test3() {
		System.out.println("test data3");
	}


@Before
public void login() {
	System.out.println("login");
}
	@After
	public void logout() {
		System.out.println("logout");
}
}
