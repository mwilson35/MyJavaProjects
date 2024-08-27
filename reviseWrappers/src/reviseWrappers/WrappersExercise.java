/**
 * 
 */
package reviseWrappers;

import java.util.Arrays;

/**
 * 
 */
public class WrappersExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int i1 = 10;
	        String i2 = "20";
	        Double i3 = 30.0;
	        Integer i4 = 40;
	        double i5 = 50.0;
		
		Double[] numbers = new Double[5];
		numbers[0] = (double) i1; // cast
		numbers[1] = Double.parseDouble(i2); // use of parse
		numbers[2] = i3; // direct assignment - autoboxing
		numbers[3] = i4.doubleValue();
		numbers[4] = i5;

		System.out.println("Unsorted ");
		for (Double number : numbers) {
			System.out.print(number + " ");
		}

		System.out.println();
		Arrays.sort(numbers);
		System.out.println("Sorted ");
		for (Double number : numbers) {
			System.out.print(number + " ");
		}
	}
}