package jut;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinInteger {

	@Test
	public void test() {
		int[] arr = {3, 5, 2, 1, 9, 4};
		IntegerArray obj=new IntegerArray();
		int output=obj.getMin(arr);
		assertEquals(1, output);
		
	}

}
