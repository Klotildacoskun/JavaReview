package iQJava;

public class SumOfArrayEntries {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6};
		int sum=7;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]+arr[j]==sum) {
					System.out.println("the pairs with sum "+sum+" are ("+arr[i]+","+arr[j]+")");
				}
			}
			
		}

	}

}
