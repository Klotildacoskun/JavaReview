package iQJava;

public class ArraysDiffElements {

	public static void main(String[] args) {
		/*
		 Given two arrays {1,2,3,4,5} and {2,3,1,9,5} 
		 find which number is  present in the second array but not in 1st array.
		 */

		int [] a1={1,2,3,4,5};
		int [] a2={2,3,1,9,5};
		
		for (int i = 0; i < a2.length; i++) {
			
			for (int j = 0; j < a1.length; j++) {
				if (a2[i]!=a1[j]) {
					continue;
					
				}else {
					System.out.println(a2[i]);
				}
				
			}
			
		}
	}

}
