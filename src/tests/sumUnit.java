package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_function = obj1.sum(4,5);
//		Test the Output 
		assertEquals(9,output_function);
	}

}
