package chapter03.operator;

import java.util.Scanner;

public class Oper_Example03 {

	public static void main(String[] args) {
		// 숙제
/*
 * 각 자리수의 합 구하기
 * 출력결과:
 * 0~999 사이의 정수를 입력하세요
 * 315
 * 각 자리수의 합:9
 */
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		int y = 0; 
		int z = 0; 
		System.out.println("백의 자리 입력:");
		x = scan.nextInt();
		System.out.println("십의 자리 입력:");
		y = scan.nextInt();
		System.out.println("일의 자리 입력:");
		z = scan.nextInt();
		
		System.out.println(""+x+y+z);
		System.out.println("각 자리수의 합:"+(x+y+z));
		
		// 숙제 정답
		System.out.println("0~999 사이의 정수를 입력하세요");
		// Scanner scan = new Scanner(System.in);
		// ↑스캐너 사용하기
		int num = scan.nextInt();
		System.out.println(num);
		// 나눗셈을 사용해서 자리수 구하기
		int num100 = num/100;
		int num10 = num%100/10;
		int num1 = num%100%10;
		int sum = num100+num10+num1;
		
		
		System.out.println("각 자리수의 합:"+sum);

		

	}

}
