package chapter17.innerclass;

class Human4 {
	int filed;
	static int staticFiled;

	// 내부 클래스는 외부의 모든 멤버를 엑세스할 수 있다.
	class Name {
		void method() {
			filed = 0;
			staticFiled = 0;
		}
	}
	// 정적 내부 클래스는 외부의 정적 멤버만 액세스할 수 있다.
	static class StaticName {
		void method() {
			// filed = 0; → 접근불가
			staticFiled = 0;
		}
	}
	// 비정적 메서드는 내부, 정적 내부 클래스 모두 액세스할 수 있다.
	void method() {
		Name n = new Name();
		StaticName sn = new StaticName();
	}
	// 정적 메서드는 내부 정적 클래스만 엑세스할 수 있다.
	static void staticmethod() {
		// Name n = new Name(); → 접근불가
		StaticName sn = new StaticName();

	}
}

public class Static_InnerClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
