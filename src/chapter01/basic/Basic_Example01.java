package chapter01.basic;

import java.util.Scanner;

public class Basic_Example01 {

	public static void main(String[] args) {
		// 입력 연습 예제
		Scanner scan = new Scanner(System.in);
		
		//정수를 입력받기
		int num = 0;
		System.out.println("정수를 입력해주세요: ");
		num = scan.nextInt();
		System.out.println("입력한 정수: "+num);
		
		//문자열을 입력받기
		String text = "";
		System.out.println("문자열을 입력해주세요: ");
		text = scan.next();
		System.out.println("입력한 문자열:"+text);
		
		scan.nextLine();
		System.out.println("문자열 입력해: ");
		String text2 = scan.nextLine();
		System.out.println("입력한 문자열2: "+text2);

				
	}

}
