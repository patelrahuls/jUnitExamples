package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AssertionsExample {
	
	@Test
	public void test1() {
		String expected = "Hello There";
		
		String actual = "Hello There";
		
		//Assertions.assertEquals(expected, actual);
		assertEquals(expected, actual);
		
		String[] expectedArray = {"one", "two","three"};
		String[] actualArray = {"one", "two","three"};
		
		assertArrayEquals(expectedArray,actualArray);
		
		boolean flag =true;
		assertTrue(flag);
;		
	}

}
