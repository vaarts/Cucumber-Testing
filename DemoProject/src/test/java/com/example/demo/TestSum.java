package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSum {
	
	DemoProjectApplication demo = new DemoProjectApplication();


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeall");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("afterall");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(9, demo.sum(4, 5));
	}

}
