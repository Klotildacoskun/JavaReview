package iQJava;

public class fibonachi10 {

	public static void main(String[] args) {
		int [] fibo=new  int[10];
		fibo[0]=0;
		fibo[1]=1;
		for (int i = 2; i <fibo.length; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		
		for (int i : fibo) {
			System.out.print(i+" ");
		}
		
	}

}
