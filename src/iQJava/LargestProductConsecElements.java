package iQJava;

import java.util.Arrays;
/*
 *  A = {5,1,3,4,2} and B = {8,10,9,7,6} 
 */
public class LargestProductConsecElements {

	public static void main(String[] args) {

		int[] arr = { 7, 11, 3, 10, 9, 2 };
		int max = 0, product = 0;

		for (int i = 1; i < arr.length; i++) {

			product = arr[i - 1] * arr[i];

			if (product > max) {
				max = product;
			} 
		}
		
		System.out.println(max);
	}

}
