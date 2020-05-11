package Exceptions;
/*
 * Why do we use exceptions?
 * why do we need them?
 * When to use them?
 * 
 * What is Exception?
 * occurs when we execute a program.
 * 
 * What is exception Handling?
 * 
 * What are checked(caught) exceptions and unchecked(uncaught)-exceptions?
 * 
 * 
 * 
 */

public class ExceptionsIntro {

	public static void main(String[] args) {
		
		try{
			int i=9/0;
			
		}catch(ArithmeticException ae){
			
		//System.out.println("Division by zero is not allowed!");
			
		ae.printStackTrace();	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
}
