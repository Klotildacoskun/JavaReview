package Exceptions;

public class ExceptionsThrowsKeyword  {

	public static void main(String[] args) {
		
		ExceptionsThrowsKeyword obj=new ExceptionsThrowsKeyword();
		//throw new ArithmeticException("AE");
		obj.sum();
		System.out.println(" Happy ending :)");

	}
    void sum(){
		
    	try {
    		div();
    	}catch (Exception ae) {
    		ae.printStackTrace();
    	}
	 }
	void div() throws ArithmeticException{
		int a= 9/0;		
	}

}
