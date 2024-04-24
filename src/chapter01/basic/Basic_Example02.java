package chapter01.basic;

import java.util.Scanner;

public class Basic_Example02 {

	public static void main(String[] args) {
		// 이름, 나이, 키를 입력받아 아래에 출력하세요
		String name = "홍길동";
		int age = 50;
		double height = 188.8;
		System.out.println("이름은 "+name+", 나이는 "+age 
				+"세"+", 키는 "+height+"입니다.");
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		//변수에 저장
		String n = "";
		System.out.println("이름을 입력하세요: ");
		n = sc.next();
		int a = 0;
		System.out.println("나이를 입력하세요: ");
		a = sc.nextInt();
		double h = 188.8;
		System.out.println("키를 입력하세요: ");
		h = sc.nextDouble();
		
		//출력
		System.out.println("이름은 "+n+"이고"
		+" 나이는 "+a+"세"+", 키는 "+h+"입니다.");
		

	}

}
