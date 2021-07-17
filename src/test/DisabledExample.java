package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)

public class DisabledExample {
	
	@CustomAnnotation
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		
		
	}
	
	@DisplayName("Negative Test")
	@RepeatedTest(5)
	@Test
	public void test2() {
		
		
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}
}
