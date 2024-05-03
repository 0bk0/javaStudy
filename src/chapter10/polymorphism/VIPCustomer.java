package chapter10.polymorphism;

public class VIPCustomer extends Customer {
	private int agID; //담당자 아이디 변수 추가됨
	double saelRatio;

	// 단축키 알트 쉬프트 에스에 알파벳 오
	public VIPCustomer(int cuID, String cuName, int agID) {
		super(cuID, cuName);
		cuGrade = "VIP";
		bonusRatio = 0.05;
		saelRatio = 0.2;
		this.agID = agID; //초기화 안해놔서 담당자번호 안나오는 사태 발생했음
	}

	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saelRatio);
	}

	@Override
	public String showCustomerInfo(){
		return super.showCustomerInfo() 
				+ "[담당 상담원 번호: " + agID + "]";
	}

}
