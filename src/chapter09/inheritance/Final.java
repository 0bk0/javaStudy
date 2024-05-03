package chapter09.inheritance;

class AA{
	final static double PI=3.14;
	void method() {
		System.out.println("method 실행");
	}
	final void finalMethod() {
		System.out.println("final method 실행");
	}
}

class BB extends AA {
	@Override
	void  method() {
		super.method(); //AA에 대한 메서드를 오버라이딩한 메서드
		System.out.println("method BB 실행"); //BB가 가진 메서드 출력
	}
//	@Override
//	final void finalMethod() {
//		
//	} 부모에서 final으로 선언했기 때문에 override 불가
	
}

public class Final {

	public static void main(String[] args) {
/*
 	final
 - final 변수: 상수,값 변경 불가능
 - final 클래스: 상속 불가능
 - final 메서드: override 불가능

 */
		AA aa=new AA();
		AA ab=new BB();
		BB bb=new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
		// aa.PI = 12345.678910;
		// final 변수라서 값 변경 불가능X
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod(); //부모가 가진 finalMethod 따따로 실행함
		bb.method();
		bb.finalMethod();


	}

}
