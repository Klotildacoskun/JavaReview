package iQJava;

import java.util.Arrays;

public class WidePath {
	public int solution(int[] X, int[] Y) {
		int width = 0;
		int maxX = 0;

		Arrays.sort(X);

		for (int i = 0; i < X.length - 1; i++) {

			width = X[i + 1] - X[i];
			if (width > maxX) {
				maxX = width;
			}

		}
		System.out.println(maxX);

		return maxX;
	}

	public static void main(String[] args) {
		int[] X = { 1, 2, 3, 23, 14, 9, 8 };
		int[] Y = { 6, 4, 1, 8, 5, 1, 7 };
		Arrays.sort(Y);

		WidePath obj = new WidePath();

		System.out.println(
				"the widest path has a width of :" + obj.solution(X, Y) + " and a height of " + Y[Y.length - 1]);
	}

}
