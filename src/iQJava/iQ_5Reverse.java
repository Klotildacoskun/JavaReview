package iQJava;

public class iQ_5Reverse {

	public static void main(String[] args) {
		// write a java program to reverse a string
		// using reverse function
		String a = "Hello Syntax";
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());
		// without using reverse function
		String tildo = "Hello World";
		// 1 way using charAt()
		String reversed = "";
		for (int i = tildo.length() - 1; i >= 0; i--) {
			reversed = reversed + tildo.charAt(i);
		}
		System.out.println("Reversed String is " + reversed);
		// 2 way using to charArray();
		String reversed1 = "";
		char[] array = tildo.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reversed1 = reversed1 + array[i];
		}
		System.out.println("Reversed String is: " + reversed1);
		// reverse a string word by word
		String str = "Todays is Sunday";
		String reversed11 = "";
		String[] array1 = str.split(" ");// split gives an array
		for (int i = array1.length - 1; i >= 0; i--) {
			reversed11 = reversed11 + array1[i] + " ";
		}
		System.out.println(reversed11);
		
		
		//tayfa 
        String str1 = "ABCD";
        System.out.println(reverse3(str1));
	}
    
    // for loop
	public static String reverse(String str) {

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	// while loop
	public static String reverse2(String str) {

		String reverse = "";
		while (str.length() > 0) {
			reverse += str.charAt(str.length() - 1);
			str = str.substring(0, str.length() - 1);
		}
		return reverse;
	}

	// StringBuffer
	public static String reverse3(String str) {

		return new StringBuffer(str).reverse().toString();
	}

}
