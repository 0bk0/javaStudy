package chapter05.loop;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// 두와일
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		do {
			System.out.println("숫자입력(끝낼 때0): ");
			num=scan.nextInt();
			sum=sum+num;
		} while(num!=0);
		System.out.println("총합계: "+sum);

	}

}
