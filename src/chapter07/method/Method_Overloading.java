package chapter07.method;

public class Method_Overloading {

	public static void main(String[] args) {
		// 오버로딩 조건
/*  	- 이름이 같아야함(필수)
		- 파라미터의 갯수, 타입, 순서가 달라야함
		장점
		- 반복작업 줄일 수 있음
		- 모듈화로 인해 전체적 코드의 가독성을 높임
		- 기능의 변경이 필요할 경우 유지보수가 쉬움
*/
		getMax(5); //param: int
		getMax(5,3.14); //param: int, double
		getMax(3.14, 5); //param: double, int
		System.out.println("[3,5]= "+getMax(3,5));
		System.out.println("[3.14,5.6]= "+getMax(3.14,5.6));

	}
	static void getMax(int a) {
		System.out.println(a);
		
	}
	static void getMax(int a, double b) {
		System.out.println(a+b);
		
	}
	static void getMax(double a, int b) {
		System.out.println(a*b);
		
	}
	static int getMax(int a, int b) {
		if(a>b) return a;
		else 	return b;
		
	}
	static double getMax(double a, double b) {
		if(a>b) return a;
		else 	return b;
		
	}

}
