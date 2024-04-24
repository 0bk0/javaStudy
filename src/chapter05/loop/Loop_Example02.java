package chapter05.loop;

import java.util.Scanner;

public class Loop_Example02 {

	public static void main(String[] args) {
		// 5번 반복시키면 됨
/*
 * 정수 5개를 입력받아 그 합을 출력하시오
 * 출력결과:
 * 정수입력:1
 * 정수입력:2
 * 정수입력:3
 * 정수입력:4
 * 정수입력:5
 * 15
 */
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int i;
		
		for(i=0;i<5;i++) {
			System.out.print("정수입력: ");
			int a = scan.nextInt();
			sum=sum+a;
		}System.out.println(sum);
		}
	}


