package chapter03.operator;

public class Arithmetic {

	public static void main(String[] args) {
		// 산술 연산자
		int a = 6, b = 4;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"/"+b+"="+((float)a/b));
		// a/b = 6-4
		// (float) a = 6.0
		// 6.0 / 4 = 1.5
		System.out.println(a+"%"+b+"="+(a%b));
	}

}
