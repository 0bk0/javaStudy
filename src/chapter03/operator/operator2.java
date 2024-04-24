package chapter03.operator;

public class operator2 {

	public static void main(String[] args) {
		// 증감 연산자
		int value = 2;
		int a = ++value;
		System.out.println("value= "+value+", a= "+a);
		
		value = 2;
		a = value++;
		System.out.println("value= "+value+", a= "+a);
		
		// 부호 연산자
		int value2 = 8;
		System.out.println(value2);
		value2 = -value2;
		System.out.println(value2);
		
		// 문자열 연산
		System.out.println(4+5);
		System.out.println("영구와"+" 땡칠이");
		System.out.println("응답하라 "+1988);
		System.out.println(""+19+88+" 응답하라");
		// 앞에 "" 붙이면 문자열로 인식해줌


	}

}
