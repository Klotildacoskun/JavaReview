package iQJava;

public class Factorial {

// Find a factorial of a number using recursion in Java.
	
	    public static void main(String[] args) {
	        
	        System.out.println(fact(5));//5*4*3*2*1
	    }
	    
	    public static int fact(int n) {
	        return (n>=1)?(n*fact(n-1)):1;//  1. step 5* fact(4)
	        								//2. step 4*fact(3)...
	    }
	


}
