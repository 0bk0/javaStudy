package chapter03.operator;

import java.util.Scanner;

public class Oper_Example02 {

	public static void main(String[] args) {
		// 예제2
/*
 * 과목 3개를 입력받아 점수에 따른 합격여부를 출력한다
 * 합격조건:
 * 3과목의 평균점수가 60점 이상
 * 한과목이라도 40점 미만이면 과락으로 불합격
 * 출력결과:
 * 국어 80
 * 영어 80
 * 수학 35
 * 합격여부: false
 */
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("국어: ");
		int 국 = scan.nextInt();
		System.out.println("영어: ");
		int 영 = scan.nextInt();
		System.out.println("수학: ");
		int 수 = scan.nextInt();
		
		double a = (국+영+수)/3.0;
		boolean b =
				a >= 60
				&&국 >= 40
				&&영 >= 40
				&&수 >= 40;
				
		System.out.println("합격여부:"+b);
		

	}

}
