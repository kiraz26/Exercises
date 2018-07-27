package tipcalculator;

import java.util.Scanner;

public class TipCalculator {
	static int numberOfPeople;
	static double amount;
	static int stars;
	static double totalAmount;
	static double totalTip;
	static double amountPerPerson;
	static double tipPerPerson;
	static double totalTax;
	public double getTip() {
		switch (stars) {
		case 1:
			totalTip = amount * 0.05;
			break;
		case 2:
			totalTip = amount * 0.10;
			break;
		case 3:
			totalTip = amount * 0.15;
			break;
		case 4:
			totalTip = amount * 0.20;
			break;
		case 5:
			totalTip = amount * 0.25;
			break;
		default:
			System.out.println("Please choose (1) (2) (3) (4) (5)");
		}
		return totalTip;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much is the bill?");
		amount = input.nextDouble();
		System.out.println("How many people will pay?");
		numberOfPeople = input.nextInt();
		System.out.println("How was the service quality?");
		stars = input.nextInt();

		TipCalculator tipMachine = new TipCalculator();
		totalTip = tipMachine.getTip();
		totalTax=amount*0.08;
		totalAmount = amount + totalTip + totalTax;
		amountPerPerson = totalAmount / numberOfPeople;
		tipPerPerson = totalTip / numberOfPeople;
		if (stars >= 1 && stars <= 5) {

			System.out.println("Total amount to pay: $" + totalAmount);
			System.out.println("Total tax: $" + totalTax);
			System.out.println("Total tip: $" + totalTip);
			System.out.println("Total per person to pay: $" + amountPerPerson);
			System.out.println("Total tip per person to pay: $" + tipPerPerson);
		}
	}

}
