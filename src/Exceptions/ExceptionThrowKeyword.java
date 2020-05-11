package Exceptions;

public class ExceptionThrowKeyword {

	public static void main(String[] args) {

		// try --either catch ( you can have multiple catches) or finally(only one)

		int age = 4;
		if (age < 5) {
			throw new ArithmeticException("age to play more");

		} else {
			System.out.println("welcome to school");
		}

	}

}
