package chapter12.object;

public class WrapperClass {

	public static void main(String[] args) {
		// 자바9버전 이후 Wrapper 클래스의 생성자 호출로부터의 인스턴스 생성을 권장안함X
		// 그렇다고 쓰지말란 건 아님

		// boxing 기본형 → 참조형
		int i = 1234;
		Integer wrapint = new Integer(i); // 기본형을 포장해서 객체화시킴
		String str = wrapint.toString();
		System.out.println(str);

		// unboxing 참조형 → 기본형
		Integer wrapint2 = new Integer(629);
		int j = wrapint2.intValue(); // 기본형 int로 변경시킴
		System.out.println(j);

		Double wrapdouble = new Double("3.14");
		int di = wrapdouble.intValue(); // 문자형으로 집어넣어도 실수형으로 뽑을 수 있음
		System.out.println(di); // int로 뽑았기 때문에 소수점은 잘림

		// auto boxing 컴파일러가 필요하다면 박싱, 언박싱을 자동으로
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		int e = c + d;
		System.out.println(e);

		Integer f = new Integer(12);
		f++;
		System.out.println(f < 20);

		// wrapper 멤버
		System.out.printf("int 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n"
				, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("short 타입의 크기 = %d, 최소값 = %d, 최대값 = %d\n"
				, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

	}

}
