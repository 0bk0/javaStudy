package chapter04.condition;

import java.util.Scanner;

public class If_Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 정수를 1개 입력받고 홀수인지 짝수인지를 출력하라
 * 출력결과:
 * 정수입력:4
 * 짝수입니다.
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");

		}// 변수를 이용한 방법도 있음(사진)
	}

}
