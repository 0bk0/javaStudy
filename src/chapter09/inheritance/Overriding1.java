package chapter09.inheritance;

public class Overriding1 {

	public static void main(String[] args) {
		// 메서드 오버라이딩 조건
		/*
		 * 1.상속관계에서 가능 
		 * 2.부모가 가지고 있는 메서드의 구조(파라미터 타입, 개수)가 통일 
		 * ,메서드 이름 통일, 리턴타입 통일해야함
		 * 3.접근지정자 범위 부모 <= 자식
		 */

		class A {
			int num = 10;

			public void methodA() {
				System.out.println("A: " + num);
			}
		}

		class B extends A {
			int num = 100;
			
			//↓구조는 같지만 서로 다른 메소드이기때문에 실체가 있는 쪽을 불러옴
			@Override //주석표시:없어도 동작함
			public void methodA() { //(int a)를 넣으면 구조가 달라서 동작안함
				System.out.println("B: " + num);
			}
		}
		//인스턴스가 생성되는 시점에서 결정(런타임시점)
		A a=new A();
		A b=new B(); // A가 B라는 실체를 담을 수는 없음
		// 따라서, A만 참조?참고?하고 실체는 B인 것(참조되는 타입의 멤버변수를 가져옴)
		B c=new B();
		// *멤버변수는 참조타입에 결정된다
		System.out.println(a.num);
		System.out.println(b.num);
		System.out.println(c.num);
		// *멤버메서드는 생성타입에 결정된다
		a.methodA();
		b.methodA();
		c.methodA();



	}

}
