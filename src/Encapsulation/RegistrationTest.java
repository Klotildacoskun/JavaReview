package Encapsulation;
/*Create Registration Class in which you would have variables  
 * * as email userName and password that have an access scope only 
  * within its own class. 
  * After creating an object of the class user should be able  
  * * to call methods and in each method separately pass values  
  * * to set users email, username and password. 
  * Requirements:
  *  Valid email consider to be only gmail
  *  Valid userName and password 
 can not be empty and should be of length larger than 6 characters. 
 Also valid password cannot contain userName.
 */

class Registration {
	private String userName, email, password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() > 6) {
				this.userName = userName;
			} else {
				System.out.println("Username should have more then 6 characters!");
			}
		} else {
			System.out.println("Username can nt be empty!");
		}
	}

	public String getEmail() {
		return email;
	}

// setting e-mail
	public void setEmail(String email) {

		if (email.contains("gmail")) {
			this.email = email;
		} else {
			System.out.println("Invalild mail address entered");
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (password.contains(userName)) {
					System.out.println("Password can not contain username!");
				} else {
					this.password = password;
				}
			} else {
				System.out.println("Password should have more then 6 characters!");
			}
		} else {
			System.out.println("Password can not be empty!");
		}
	}

}

public class RegistrationTest {

	public static void main(String[] args) {
		Registration obj = new Registration();
		obj.setUserName("encap2020");
		System.out.println(obj.getUserName());
		obj.setEmail("encap2020@gmail.com");
		System.out.println(obj.getEmail());
		obj.setPassword("encap2020trerer");
		System.out.println(obj.getPassword());

	}
}
