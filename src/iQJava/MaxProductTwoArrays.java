package iQJava;

import java.util.HashMap;

public class MaxProductTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 5, 1, 3, 4, 2 };
		int[] arr2 = { 8};
		HashMap<Integer, Integer> productPairs = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				productPairs.put(arr1[i], arr2[j]);

			}

		}
		System.out.println(productPairs);
	}

}
