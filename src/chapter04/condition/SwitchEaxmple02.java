package chapter04.condition;

import java.util.Scanner;

public class SwitchEaxmple02 {

	public static void main(String[] args) {
		// 계산기
/*
 * 정수 2개와 연산자를 입력받아 결과를 출력함
 * 단, 분모가 0일경우 "0으로 나눌수 없음"을 출력함
 * 출력결과:
 * 	연산자(+-*, /):/
 * 	정수1입력:3
 * 	정수2입력:0
 * 	0으로 나눌수 없음
*/
		//result 사용한 간단방법있음(사진)
		Scanner scan = new Scanner(System.in);
		System.out.println("연산자(+-*/): "); 
		String ㅇ = scan.next(); //문자열 or 캐릭터형 둘다 OK
		System.out.println("정수1입력: ");
		int a = scan.nextInt();
		System.out.println("정수2입력: ");
		int b = scan.nextInt();
		
		switch (ㅇ) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			if(b==0) {
				System.out.println("0으로 나눌수 없음");
				break;
			}
			System.out.println(a/b);
			break;
		default:
			System.out.println("연산자 잘못입력함");
			break;
		}
		
	}

}
