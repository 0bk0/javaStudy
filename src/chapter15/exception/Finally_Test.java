package chapter15.exception;

import java.util.Scanner;

public class Finally_Test {

	public static void main(String[] args) {
		System.out.println("접속");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("전송");
			
			System.out.println("입력");
			int a = scan.nextInt();
			System.out.println(a);

			throw new Exception();
/*		try {
			System.out.println("전송");
			throw new Exception();		*/
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally { // 무조건 실행되어지는 출력
			System.out.println("해제");
			scan.close(); // 자원 할당을 해제하는 메서드

		}
		System.out.println("프로그램 종료");
	}

}
