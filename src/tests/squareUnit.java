package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_function = obj1.square(4);
//		Test the Output 
		assertEquals(16,output_function);
	}

}
