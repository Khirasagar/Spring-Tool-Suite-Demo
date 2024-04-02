package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {

	@Test
	void test1() {
		System.out.println("From test1");
	}
	@Test
	void test2() {
		System.out.println("From test2");
	}
	@BeforeEach
	void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterEach
	void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeAll
	static void beforeAllOnce() {
		System.out.println("Before all once");
	}
	@AfterAll
	static void afterAllOnce() {
		System.out.println("After all once");
	}
	

}
