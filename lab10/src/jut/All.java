package jut;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MaxInteger.class, MinInteger.class })
public class All {

}













package lab12;
import java.util.*;

public class Main {
	
		public static void main(String[] args) {
			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Invoke getArray method
			int[] array = getArray();

			// Prompt the user to enter the index of the array
			System.out.print("Enter the index of the array: ");
			try {
				// Display the corresponding element value
				System.out.println("The corresponding element value is " + 
					array[input.nextInt()]);
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of Bounds.");
			}
		}

		/** Returns an array with 10 randomly chosen integers */
		public static int[] getArray() {
			int[] array = new int[10];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 100) + 1;
			}
			return array;
		}
	}
