package chapter17.innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inclass;

	public OutClass() {
		inclass = new InClass();
	}

	class InClass {
		int innum = 100;
		static int sInnum = 100;

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수1)");
			System.out.println("OutClass num = " + OutClass.this.num + "(외부 클래스의 인스턴스 변수2)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수1)");
			System.out.println("OutClass sNum = " + OutClass.sNum + "(외부 클래스의 정적 변수2)");

			System.out.println("InClass innum = " + this.innum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InClass sInnum = " + this.sInnum + "(내부 클래스의 정적 변수)");

		}
	}

	public void usingClass() {
		inclass.inTest();
	}
}

public class InnerClass_Test2 {

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outclass.usingClass();

		System.out.println("\n다른 클래스에서 인스턴스 내부 클래스 생성");
		OutClass outclass2 = new OutClass();
		OutClass.InClass inclass = outclass2.new InClass();
		inclass.inTest();

	}

}
