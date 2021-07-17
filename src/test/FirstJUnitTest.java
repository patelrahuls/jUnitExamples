package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {

	@BeforeAll
	public static void beforeAllMethod() {
		System.out.println("Before ALL Method");
	}

	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before Each Method");
	}

	@Test
	public void testcase() {
		System.out.println("Inside test case");
	}

	@Test
	public void testcase1() {

		boolean flag = false;
		Assert.assertTrue(flag);
		System.out.println("Inside test case 1");
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("After Each Method");
	}

	@AfterAll
	public static void afterAllMethod() {
		System.out.println("After ALL Method");
	}

}
