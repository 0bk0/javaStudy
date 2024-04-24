package chapter08.classPart;

public class Construnctor2 {

	public static void main(String[] args) {
		//Time t = new Time();
		//System.out.println(t.num);//인스턴스 통해서
		//↕둘다 이용해서 출력가능
		System.out.println(Time.num);//클래스이름 통해서
		
		method1();
		Construnctor2 c = new Construnctor2();
		c.method2(); //static이 없어서 사용 불가능함.
		// 1. static 2. stack && heap 순서로 만들어짐
		// 따라서, 2에서 1을 참조할 순 있지만 반대는 불가능
		
		// static:가장 먼저 만들어지는 메모리=가장먼저 실행됨=가장 처음만 초기화시킴
		// static(X):인스턴스 만들때마다 초기화시킴
		// 생성자가 많아져 중복될 때는 인스턴스 초기화블록 안에서 공통적인 것들을 초기화함
	}
	public static void method1() {
		
	}
	public void method2() {
		
	}
}
