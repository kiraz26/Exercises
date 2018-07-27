package tipcalculator;

public class Bill {
	public int numberOfPeople;
	double amount;
	 int stars;
	public double totalAmount;
	public double totalTip;
	public double amountPerPerson;
	public double tipPerPerson;

	public double getTip() {
		switch (stars) {
		case 1:
			totalTip=amount*0.05;
			break;
		case 2:
			totalTip=amount*0.10;
			break;
		case 3:
			totalTip=amount*0.15;
			break;
		case 4:
			totalTip=amount*0.20;
			break;
		case 5:
			totalTip=amount*0.25;
			break;
		default:
			System.out.println("Please choose (1) (2) (3) (4) (5)");
		}
		return totalTip;
	}
}
