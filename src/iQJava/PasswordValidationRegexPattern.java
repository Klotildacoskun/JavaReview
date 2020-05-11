package iQJava;

import java.util.regex.Pattern;

public class PasswordValidationRegexPattern {
	private Pattern pattern;
	private final static String PasWordValid = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	public PasswordValidationRegexPattern() {
		pattern = Pattern.compile(PasWordValid);
	}

	public boolean validate(String password) {
		return pattern.matcher(password).matches();
	}

	public static void main(String[] args) {
		String pw = "Mevlut123";
		PasswordValidationRegexPattern pasword = new PasswordValidationRegexPattern();
		System.out.println(pasword.validate(pw));
	}

}
