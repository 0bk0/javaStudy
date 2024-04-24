package chapter05.loop;

import java.util.Scanner;

public class Loop_Example03 {

	public static void main(String[] args) {
		// 진심 1도 모르겠음
/*
 * 합 구하기
 * 2개의 정수를 입력받아 입력받은 정수를 포함한
 * 사이값들의 총합을 구하시오
 * 단, 입력순서에 상관없이 합을 구할 것.
 * 출력결과:
 * 숫자입력:5 숫자입력:10
 * 숫자입력:10 숫자입력5
 * 45 45
 */
		Scanner scan = new Scanner(System.in);
		//먼저 입력부터 받음
		System.out.print("숫자입력: ");
		int s = scan.nextInt();
		System.out.print("숫자입력: ");
		int e = scan.nextInt();
		//변수명
		int sum=0;
		int a=0;
		//시작수가 끝수보다 크면 서로서로 바꿔주기
		if(s>e) {
			a=s;
			s=e;
			e=a;			
		}
		//i가 시작수부터 끝수까지 한개씩 늘어나고 총합
		int i;
		for(i=s;i<=e;i++) {
			sum+=i;}
		System.out.println(sum);
		}
	}

