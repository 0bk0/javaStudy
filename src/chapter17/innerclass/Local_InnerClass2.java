package chapter17.innerclass;

class Human5 {
	int age;
	String name;

	Human5(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void intro() {
		final String nameCaption = "이름";
		final String ageCaption = "나이";

		// 지역 내부 클래스는 객체를 생성하기 전에 클래스 선언문이 먼저 와야 한다.(클래스 선언보다 먼저 인스턴스 생성 못함)
/*
		 * Formatter format = new Formatter();
		 * format.outInfo();
*/
		// 지역 내부 클래스는 잠시 선언해서 사용하는 임시적인 타입이어서 접근지정자 및 스텝틱을 붙일 수 없음
		class Formatter {
			void outInfo() {
				// (p.645-3번째 단락)지역 내부 클래스에서 사용되는 변수들은 반드시 final 값이어야함
				// intro()라는 가장 큰 바깥 쪽의 메서드가 닫혀버리면 지역변수들도 없어지는 값들이기 때문
				// outInfo는 언제 호출될지 모르는 메서드이기에 final이 빠지면 언제 값이 변경되어지는지 몰라서 예측할 수 없음
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);

			}
		}
		// final 빼고 값 변경하려니까 outInfo 안에 nameCaption가 에러남
		// nameCaption = "변경";

		Formatter format = new Formatter();
		format.outInfo();
	}
}

public class Local_InnerClass2 {

	public static void main(String[] args) {
		Human5 kim = new Human5(29, "김상혁");
		kim.intro();

	}

}
