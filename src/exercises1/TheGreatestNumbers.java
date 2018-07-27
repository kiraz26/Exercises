package exercises1;

import java.util.Scanner;

public class TheGreatestNumbers {

	static int num1;
	static int num2;
	static int num3;
	static int x;
	static int resultGreatest;

	public int getGreatest(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else if (num3 > num1 && num3 > num2) {
			return num3;
		} else {
			return x;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = input.nextInt();
		System.out.println("Enter the second number:");
		num2 = input.nextInt();
		System.out.println("Enter the third number:");
		num3 = input.nextInt();

		TheGreatestNumbers number = new TheGreatestNumbers();
		resultGreatest = number.getGreatest(num1, num2, num3);

		if (resultGreatest == 0) {
			System.out.println("ERROR");
		} else {
			System.out.println("The greatest number is " + resultGreatest);
		}
	}

}
