package chapter17.innerclass;

public class Local_InnerClass {

	public static void main(String[] args) {
		// 메인에서 바로 클래스 선언해서 동시에 사용도 가능함
		// 지역 내부 클래스 = 메서드 내에서 클래스 선언 / 메서드 내부에서만 유효
		class Human99 {
			int age;
			String name;

			Human99(int age, String name) {
				this.age = age;
				this.name = name;
			}

			void intro() {
				System.out.println(age + "살, " + name + "이야.");
			}
		}
		Human99 kim = new Human99(29, "김상혁");
		kim.intro();

	}
	// 부를수가 없음 메서드끼리는 서로 다른 영역을 가지고 있기때문에 참조할 수 없음
	// 메서드 외부에서는 지역 내부 클래스를 참조할 수 없다
	static void otherMethod() {
		// Human99 kim = new Human99(29, "김상혁");

	}
}
