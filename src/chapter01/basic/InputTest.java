package chapter01.basic;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// 입력
		Scanner scan = new Scanner(System.in);
		// import : ctrl + shift + O or M
		
		System.out.println("byte: ");
		byte a = scan.nextByte();
		System.out.println("short: ");
		short b = scan.nextShort();
		System.out.println("int: ");
		int c = scan.nextInt();
		System.out.println("long: ");
		long d = scan.nextLong();
		System.out.println("double: ");
		double e = scan.nextDouble();
		System.out.println("float: ");
		float f = scan.nextFloat();
		System.out.println("string: ");
		String g = scan.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}

}
