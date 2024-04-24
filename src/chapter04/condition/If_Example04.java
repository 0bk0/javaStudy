package chapter04.condition;

import java.util.Scanner;

public class If_Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 등급 나누기
 * 정수(0-100사이의 점수)를 입력받아 등급을 출력한다.
 * 등급은 수,우,미,양,가 로 구분한다.
 * 단, 0-100 이외의 숫자를 입력시
 * "잘못입력했습니다"문구를 출력하고, 프로그램을 종료한다.
 * 출력결과:
 * 점수입력:87
 * 우
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력: ");
		int s = scan.nextInt();
		//1번 방법(직관적)
		if(s>=90&&s<=100) {
			System.out.println("수");
		} else if(s>=80&&s<90) {
			System.out.println("우");
		} else if(s>=70&&s<80) {
			System.out.println("미");
		} else if(s>=60&&s<70) {
			System.out.println("양");
		} else if(s>=0&&s<60) {
				System.out.println("가");
		} else {
		System.out.println("잘못입력했습니다");
		// System.exit(0); 실행종료
		}
		//2번 방법(사진)
	}
	}