package chapter03.operator;

import java.util.Scanner;

public class Oper_Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 점수 3개를 입력받아 각 변수(kor, eng, math)에 값을 넣고, 총합(sum)과 평균(avg)을 출력하세요.
 * 평균값은 소수점을 포함한 점수로 출력하세요.
 * hint:평균에 소수점을 구하기 → 연산 중에 자동 형변환 참고.
 * 출력결과:
 * kor점수:80
 * eng점수:75
 * math점수:35
 * 총합:190 평균:63.333333333333336
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("kor점수 입력: ");
		int k = scan.nextInt();
		System.out.println("eng점수 입력: ");
		int e = scan.nextInt();
		System.out.println("math점수 입력: ");
		int m = scan.nextInt();
		
		int sum = k+e+m;
		double avg = sum/3.0; //3이면 int끼리만 연산하면 몫만 구하기때문에 3.0을 넣음
		System.out.println("총합: "+sum+", 평균: "+avg);


				
		
		

		
		
	}

}
