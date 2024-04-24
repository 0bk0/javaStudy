package bk;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 첫째 줄에 A+B를 출력한다.
		int A, B;
		Scanner scan = new Scanner(System.in);
		System.out.print("번호입력1: ");
		A = scan.nextInt();
		System.out.print("번호입력2: ");
		B = scan.nextInt();
		if(0<A && B<10) {
			System.out.println(A+B);
		}	
		// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 첫째 줄에 A/B를 출력한다.
		// 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = (double)a/b;
        System.out.println(c);





	}

}
