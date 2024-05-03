package chapter10.polymorphism;

public class GoldCustomer extends Customer {
	double saelRatio;

	public GoldCustomer(int cuID, String cuName) {
		super(cuID, cuName);
		cuGrade = "GOLD";
		bonusRatio = 0.02; //보너스 적립률
		saelRatio = 0.1; //할인률
	}

	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saelRatio);
	}

}
