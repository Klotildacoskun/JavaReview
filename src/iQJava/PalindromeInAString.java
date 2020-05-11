package iQJava;

import java.util.HashSet;
import java.util.Set;

public class PalindromeInAString {

	public static void main(String[] args) {
		String palindrome= "myracecar";
		System.out.println(findAllPalindromesUsingBruteForceApproach(palindrome));
		
	}
	public static Set<String> findAllPalindromesUsingBruteForceApproach(String input) {
	    Set<String> palindromes = new HashSet<>();
	    
	    for (int i = 0; i < input.length(); i++) {
	        for (int j = i + 1; j <= input.length(); j++) {
	            if (isPalindrome(input.substring(i, j))) {
	                palindromes.add(input.substring(i, j));
	            }
	        }
	    }
	    return palindromes;
	}
	
	private static boolean isPalindrome(String input) {
		
		StringBuilder plain = new StringBuilder(input);
		StringBuilder reverse = plain.reverse();
		return (reverse.toString()).equals(input);
		}


}
