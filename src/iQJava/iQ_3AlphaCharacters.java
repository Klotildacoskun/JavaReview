package iQJava;

public class iQ_3AlphaCharacters {
	public static void main(String[] args) {
		//how many alpha charachters
		
		String given="123456789@#$%^&7890$%^&*dfghjertyuvbnmcvbnfghj";
		String replaced=given.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced);
	}

}
