package iQJava;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 37;
		System.out.println(isPrime(n));
		evenNumbersTillN(31);
	}

	public static boolean isPrime(int n) {
		boolean flagIsPrime = true;
		for (int i = 2; i < n / 2; i++) {

			if (n % i == 0) {
				flagIsPrime = false;
				System.out.println(n + " is NOT a prime number");
				break;

			}

		}
		System.out.println(n + " is a prime number");
		return flagIsPrime;
	}

	public static int[] evenNumbersTillN(int n) {
		int[] evenNumbers = new int[n/2+1];
		evenNumbers[0]=0;
		int j=1;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				evenNumbers[j] = i;
				j++;
			}
		}
		for (int i : evenNumbers) {
			System.out.print(i+ " ");
		}
		return evenNumbers;
	}
}
