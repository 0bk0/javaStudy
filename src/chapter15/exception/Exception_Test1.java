package chapter15.exception;

public class Exception_Test1 {

	public static void main(String[] args) {
/*
	예외처리(Exception handing)란
	프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
	프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
	
	프로그램 오류
	1. 컴파일에러(compile-time error):컴파일할 때 발생하는  에러
	2. 런타임에러(runtime error):실행할 때 발생하는 에러
	(문법에는 맞아 컴파일은 됐지만 실제로 JVM이 코드를 실행할 때 문제가 발생하는 경우)
	3. 논리적에러(logical error):작성 의도와 다르게 동작
 */
		int a,b,c;
		a=2;
		b=0;
	//	c=a/b;
		//System.out.println("c="+c);
	/*	if (b != 0) {
			c=a/b;
			System.out.println("c="+c);
		}else
			System.out.println("0으로 나눌수 없음");	*/
		try {
			c=a/b;
			System.out.println("c="+c);
		} catch (Exception e) { //Exception타입의 인스턴스 e를 생성한 것처럼 e에 담음
			//e.printStackTrace(); //에러 정보를 출력하는 메서드
			System.out.println("0으로 나눌수 없음");	
		}
		System.out.println("프로그램 실행완료");
	}

}
