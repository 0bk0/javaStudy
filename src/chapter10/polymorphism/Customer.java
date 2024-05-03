package chapter10.polymorphism;

public class Customer {
	//protected 접근제어범위가 상속관계에서만 사용
	protected int cuID;
	protected String cuName;
	protected String cuGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() { //초기값 없는 !기본 생성자!
		//err → cntl + 숫자1
		initCustomer(); //메서드 호출
	}
	public Customer(int cuID,String cuName) { //명시적 생성자
		this.cuID=cuID;
		this.cuName=cuName;
		initCustomer();
	}
	private void initCustomer() {
		cuGrade = "SILVER"; //초기화
		bonusRatio = 0.01; //초기화
	}

	public int clacPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return cuName+"님의 등급은 "+cuGrade+"이고, 보너스포인트는"
				+bonusPoint+"입니다.";
	}
	//게터세터 단축키: 알트 쉬프트 엔터 뭐드라
	public int getCuID() {
		return cuID;
	}
	public void setCuID(int cuID) {
		this.cuID = cuID;
	}
	public String getCuName() {
		return cuName;
	}
	public void setCuName(String cuName) {
		this.cuName = cuName;
	}
	public String getCuGrade() {
		return cuGrade;
	}
	public void setCuGrade(String cuGrade) {
		this.cuGrade = cuGrade;
	}
	
}
