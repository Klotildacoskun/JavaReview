package iQJava;

public class GoodString {

	public static void main(String[] args) {

		String[] array = { "hello", "come", "hat", "well","mee", "heeeell" };
		String chars = "Wellcome Home";
		chars=chars.toLowerCase();
		int sum = 0;
		//traverse all the elements in the given array
		for (String word : array) {
			 
			// convert each arr element to a char array.
			char[] wordToCharArray = word.toCharArray();
			
			// counter is reset for each word that is checked.
			int counter = 0;
			
			// for each letter check whether the letter is contained in the given chars String.
			// I am using indexOf method which returns -1 if a letter is not contained.
			for (char letter : wordToCharArray) {

				int index = chars.indexOf(letter);
				// by using a counter I check if all the letters in the word don't return -1
				
				if (index != -1) {
					counter++;

				} else {	// The loop will break if a letter not present is met.
					break;
				}

			}
			// if the counter size is equal to the word length then this means that all the 
			// letters are in the given string therefore I can add this string length.
			
			if (counter == word.length()) {
				sum += word.length();

			}
		}
		System.out.println(sum);

	}
}
