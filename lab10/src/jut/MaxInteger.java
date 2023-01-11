package jut;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxInteger {

	@Test
	public void test() {
		int[] arr = {3, 5, 2, 1, 9, 4};
		IntegerArray obj=new IntegerArray();
		int output=obj.getMax(arr);
		assertEquals(9, output);
	}

}
