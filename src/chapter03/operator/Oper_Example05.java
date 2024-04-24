package chapter03.operator;

import java.util.Scanner;

public class Oper_Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 정수 3개를 입력받아 각 변수(a,b,c)에 값을 넣고, 입력받은 값 중 최대값(max)을 출력하세요
 * hint: 삼항연산자(중복사용)
 * 출력결과:
 * 첫번째 정수:2
 * 두번째 정수:4
 * 세번째 정수:1
 * 최대값:4
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		int a = scan.nextInt();
		System.out.println("두번째 정수: ");
		int b = scan.nextInt();
		System.out.println("세번째 정수: ");
		int c = scan.nextInt();
		
		int max = (a>b&&a>c)?a:(b>c)?b:c;
		// a가 b,c보다 크면 a를 출력 아니면 b랑 c 비교해서 둘중에 큰 거 출력함.
		System.out.println("최대값: "+max);


	}

}
