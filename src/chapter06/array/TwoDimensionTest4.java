package chapter06.array;

import java.util.Scanner;

public class TwoDimensionTest4 {

	public static void main(String[] args) {
		// 정렬하기 : 컨트롤+쉬프트+알파벳 f
		/*
		 * 문제: 원소 개수를 입력받아 배열을 생성하고 각 원소의 값을 입력받아 저장한 후, 전체 원소의 합계를 구하여 출력한다 조건: 배열 원소
		 * 개수는 2 이상의 정수로 입력받는다 2미만의 값이 입력되면 오류 메세지를 출력하고 다시 입력받는다 출력결과 배열의 크기: 5
		 * arr[0]=1 arr[1]=2 arr[2]=3 arr[3]=4 arr[4]=5 1+2+3+4+5=15
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기 : ");
		int a = scan.nextInt();

		while (a < 2) {
			System.out.println("2이상 값을 입력해라");
			System.out.print("배열의 크기 : ");
			a = scan.nextInt();
		}
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += i;
			if (i != a - 1) {
				System.out.print(arr[i] + "+");
			} else {
				System.out.print(arr[i] + "=" + sum);
			}

		}

	}

}
