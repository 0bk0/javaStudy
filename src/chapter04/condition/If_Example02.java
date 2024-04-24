package chapter04.condition;

import java.util.Scanner;

public class If_Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3개의 정수를 입력받아 if문을 활용하여 가장 큰 수를 출력한다.
 * 출력결과:
 * 숫자1:3
 * 숫자2:1
 * 숫자3:2
 * 최대값:3
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1: ");
		int 일 = scan.nextInt();
		System.out.println("숫자2: ");
		int 이 = scan.nextInt();
		System.out.println("숫자3: ");
		int 삼 = scan.nextInt();
		
		int max=일;
		if(max<이) {
			max=이;
		}
		if(max<삼) {
			max=삼;
		}
		System.out.println("최대값: "+max);
		// 줄인 버전도 있음(사진)

/* 		if(일>이) {
			System.out.println("최대값: "+일);
		} else if(이>삼) {
			System.out.println("최대값: "+이);
		} else {
			System.out.println("최대값: "+삼);
*/

	}

}
