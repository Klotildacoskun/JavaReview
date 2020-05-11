package iQJava;

import java.util.Arrays;

public class IQ_2SecondBiggest{

	public static void main(String[] args) {
		int[] numArray = { 12, 13, 12, 15, 0, -1, 15, -3 };
		Arrays.sort(numArray);
		int smallest = numArray[0];
		int biggest = numArray[0];
		int secondbiggest = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > biggest) {
				secondbiggest = biggest;
				biggest = numArray[i];
				System.out.println("text");
				
			} else {
				// if(numArray[i]<smallest) {
				smallest = numArray[i];
				// }
			}
		}
		System.out.println("------");
		System.out.println(smallest);
		System.out.println(biggest);
		System.out.println(secondbiggest);
		
		for (int num : numArray) {
			if (smallest>num) {
				smallest=num;
			}
		}
		System.out.println(smallest);
		
	}

	
}
