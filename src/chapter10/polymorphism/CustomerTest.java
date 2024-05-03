package chapter10.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[5];
		// 변수에 안집어넣고 그냥 방 안에다가 생성자 바로 집어넣은 방식
		customerList[0] = new Customer(10010, "이순신");
		customerList[1] = new Customer(10020, "신사임당");
		customerList[2] = new GoldCustomer(10030, "율곡이이");
		customerList[3] = new GoldCustomer(10040, "퇴계이황");
		customerList[3].bonusPoint = 1000;
		customerList[4] = new VIPCustomer(10050, "세종대왕", 1588);
		customerList[4].bonusPoint = 2000;

		System.out.println("========고객 정보 출력========");
		for (Customer c : customerList) {
			// 객체 배열 속에서 꺼내온 것을 Customer 타입으로 지정하고 c에 담음
			System.out.println(c.showCustomerInfo());
	// Customer 안에 저장된(골드,브이아이피)각각의 showCustomerInfo를 출력함
		}
		System.out.println("========*할인율/보너스 포인트*========");
		int price = 10000;
		for (Customer c : customerList) {
			int cost = c.clacPrice(price);
			System.out.println(c.getCuName() + "님이" + cost + "원 지불하심");
			System.out.println(c.getCuName() + "님의 현재 보너스 포인트는 " + c.bonusPoint + "입니다");
		}

	}

}
