package chapter04.condition;

import java.util.Scanner;

public class If_Example06 {

	public static void main(String[] args) {
		// 숙제
/*
 * BMI 계산하기
 * BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산한다.
 * 이 계산 결과에 따라 다음과 같이 판단된다.
 * 저체중:18.5 미만
 * 정상:18.5이상, 23미만
 * 과체중:23이상 25미만
 * 비만:25이상
 * 키(cm), 몸무게를 입력받아 BMI를 계산하시오.
 * 출력결과
 * BMI지수: 20.xxxxx(정상)
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키(cm): ");
		int h = scan.nextInt();
		System.out.print("몸무게(kg): ");
		int w = scan.nextInt();
		
		// h/=100; 미터단위로 변환 h=h/100;
		double h1 = h/100.0;
		//double h2 = h1*h1;
		double b = w/(h1*h1);
		//String result = "";
		System.out.print("BMI지수: "+b);
		
		if(18.5>b) {
			System.out.print("(저체중)"); 
		} else if(23.0>b) { //18.5<=b && 23>b
			System.out.print("(정상)");
		} else if(25.0>b) { //23<=b && 25>b
			System.out.print("(과체중)");
		} else if(25.0<b) { // else
			System.out.print("(비만)");
		} 
		}}

		


	


