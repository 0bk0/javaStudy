package chapter02.data;

public class DataType {

	public static void main(String[] args) {
		/*(공책에 이어서)2.참조형 데이터타입
		 * 기본형 데이터타입이 아닌 모든 "객체"
		 * class, enum, array, interface 등등
		 * */
		
		//기본형 데이터타입
		byte a = 127; // 128부터 에러발생
		short b = 12345;
		int c = 1234567890;
		long d = 12345678900L; // 대소문자 상관없이 l(엘)을 써야함
		//eclipse에서는 int를 기본 숫자타입으로 지정하고 있기 때문임↑
		
		char e = 'A';
		float f = 3.14f; //F or f
		double g = 3.14;
		boolean h = true; //true or false
		
		System.out.println("byte: "+a);
		System.out.println("short: "+b);
		System.out.println("int: "+c);
		System.out.println("long: "+d);
		System.out.println("char: "+e);
		System.out.println("float: "+f);
		System.out.println("double: "+g);
		System.out.println("boolean: "+h);
		
		//문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println((int)alpha);
		
		//정수형 타입의 문자화
		char ch1 = 66;
		System.out.println(ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2);
		
		//상수 final(못바꾸는 성질이 있는 예약어)
		final double pi = 3.14;
		
		//자동 형 변환
		int aaa = 3;
		double bbb = aaa;
		System.out.println(bbb);
		
		//강제 형 변환
		double ccc = 3.14;
		int ddd = (int)ccc;
		System.out.println(ddd);
	}

}
