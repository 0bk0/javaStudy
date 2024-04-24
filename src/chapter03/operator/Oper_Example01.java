package chapter03.operator;

import java.util.Scanner;

public class Oper_Example01 {

	public static void main(String[] args) {
		// 예제1
/* 
 * 상품가격과 받은 금액을 입력받아서 거스름돈 출력
 * 출력결과:
 * 받은금액:10000
 * 상품가격:1500
 * 거스름돈:8500
 */
		Scanner scan = new Scanner(System.in);
		
		int a = 0; //받은금액
		int b = 0; //상품가격
		int c = 0; //거스름돈
		
		System.out.println("받은 금액: ");
		a = scan.nextInt();
		System.out.println("상품 가격: ");
		b = scan.nextInt();
		c = a-b;
		System.out.println("거스름돈: "+c);
		
		

	}

}
