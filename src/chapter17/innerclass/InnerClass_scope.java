package chapter17.innerclass;

class OuterClass {
	// 멤버 변수
	int a = 10; // 인스턴스 변수
	static int b = 20; // 클래스 변수, 정적 변수
	// 멤버 메서드

	void method() {
		int c = 30; // 지역 변수
		System.out.println(c);
	}
}

class OuterClass2 {
	class A {
	} // 인스턴스 내부클래스 - 스텝틱 영역아니니까 아우터 클래스 내부에서만 쓸 수있는 인스턴스내부클래스

	static class B {
	} // 정적 내부클래스 - 타입이 클래스임

	void method() {
		class C {
		} // 지역 내부클래스
	}
}

public class InnerClass_scope {
/*
	내부 클래스(inner class)란 하나의 클래스 내부에 선언된 또다른 클래스
	보통 두 클래스가 서로 긴밀한 관계에 있거나, 하나의 클래스 또는 메서드에서만
	사용되는 클래스일 경우 이용되는 기법
	
		- 클래스를 논리적으로 그룹화
		- 기존보다 더 많은 캡슐화의 적용
		  외부 클래스의 멤버를 private로 선언하면 외부에서는 getter/setter
		  메서드를 사용하지 않는 한 접근이 불가능하다.
		  but, 외부 클래스 안에 내부 클래스를 생성할 경우, 내부 클래스는 private
		  멤버들에 대해 아무런 제한 없이 접근이 가능하다.
		  또한, 외부 클래스의 private 멤버를 사용하면서 자기 자신의 접근 제한
		  역시 private으로 설정해 외부로부터의 접근을 차단할 수 있다.
		  = 외부로부터의 데이터 보호 = 캡슐화
		- 가독성, 유지관리가 쉬운 코드 작성
 */

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.a);
		System.out.println(OuterClass.b);
		oc.method();

	}

}
