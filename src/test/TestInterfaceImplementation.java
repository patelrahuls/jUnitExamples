package test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestInterfaceImplementation implements TestInterface {
	
	@Override
	public void method1() {
		System.out.println("Inside class");
	}
	
	@Test
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("bananb"));
	}

}
