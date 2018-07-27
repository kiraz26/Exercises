package exercises1;

import java.util.Scanner;

public class LoginValidator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "halilkiraz";
		String pass = "123";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the username:");
		String username = input.nextLine();
		System.out.println("Enter the password:");
		String password = input.nextLine();

		if (username.equalsIgnoreCase(user) && password.equals(pass)) {
			System.out.println("Login Successful");
		} else if (username.length() == 0 && password.length() == 0) {
			if (username.length() == 0) {
				System.out.println("Username cannot be blank");
			}
			if (password.length() == 0) {
				System.out.println("Password cannot be blank");
			}

		} else if (!username.equalsIgnoreCase(user) || !password.equals(pass)) {
			if (!username.equalsIgnoreCase(user)) {
				System.out.println("Username is incorrect");
			}
			if (!password.equals(pass) && username.equalsIgnoreCase(user)) {
				System.out.println("Password is incorrect");
			}
		}

	}

}
