package chapter17.innerclass;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;

	static class InStaticClass {
		int innum = 100;
		static int sInnum = 200;

		void inTest() {
			System.out.println("InStaticClass innum = " + innum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInnum = " + sInnum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			// System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수 사용)");
			// ↓인스턴스를 만들어야만 부를수 있는데 스텝틱영역에서 부르려니까 안되는 것임

		}

		static void sTest() { // 스텝틱한 영역의 정적메서드
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInnum = " + sInnum + "(내부 클래스의 정적 변수 사용)");
			// System.out.println("InStaticClass innum = " + innum + "(내부 클래스의 인스턴스 변수 사용)");
			// ↓마찬가지로 얘도 안됨

		}
	}
}

public class Static_InnerClass1 {

	public static void main(String[] args) {
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println("\n정적 내부 클래스 정적 메서드 호출");
		OutClass2.InStaticClass.sTest();

	}

}
