package iQJava;
/* 	Create a 2D array or integer type where
you will store odd and even numbers in 3
rows and 4 columns. Develop a program
which will identify/print the even
numbers only. */

public class oddEven {

	public static void main(String[] args) {
		int [][] oddEven=new int[3][4];// 3 rows 4 columns
		
		oddEven[0][0]=2;oddEven[0][1]=3;oddEven[0][2]=4;oddEven[0][3]=5;//0.row
		oddEven[1][0]=6;oddEven[1][1]=7;oddEven[1][2]=8;oddEven[1][3]=9;//1.row
		oddEven[2][0]=10;oddEven[2][1]=11;oddEven[2][2]=12;oddEven[2][3]=13;//2.row
		
		for (int[] row : oddEven) {
			for (int col : row) {
				if(col%2==0) {
					System.out.print(col+" ");
				}
			}
			System.out.println();
		}

	}

}
