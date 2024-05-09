package chapter17.innerclass;

class A {
	void method() {
		System.out.println("A1");
	}
}

interface B { // 구현부가 존재하지않는 추상메서드 B?
	void methodB();
}

public class AnonymousClass1 {

	public static void main(String[] args) {
		A a = new A();
		a.method();

		// 딱 한번 사용되고 말 !익명 클래스! → new 조상클래스 이름()
		new Object() {
			void method() {
				System.out.println("A2");
			}
		}.method();

		// new 구현하는 인터페이스 이름{}
		new B() {
			@Override
			public void methodB() {
				System.out.println("B");
			}
		}.methodB();
	}

}
