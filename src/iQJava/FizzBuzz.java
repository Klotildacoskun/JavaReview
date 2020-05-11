package iQJava;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print("Fizz Buzz," + " ");
				} else {
					System.out.print("Fizz," + " ");
				}
			} else if (i % 5 == 0) {
				System.out.print("Buzz," + " ");
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		int a=5,b=7;
		if (a > b) {
			System.out.println("1");

		} else {
			System.out.println("2");
		}
	}
}
