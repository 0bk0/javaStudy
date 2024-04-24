package chapter04.condition;

import java.util.Scanner;

public class If_Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 사각형의 넓이 구하기
 * 가로 세로 길이를 입력받아 넓이를 구하시오
 * 단, 가로와 세로의 길이를 비교하여 정사각형 or 직사각형을 출력한다
 * 출력 결과:
 * 가로입력:5
 * 세로입력:4
 * 직사각형의 넓이는 20입니다.
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로길이: ");
		int 가 = scan.nextInt();
		System.out.println("세로길이: ");
		int 세 = scan.nextInt();
		int 넓 = 가*세;
		
		if(가>세) {
			System.out.println("직사각형의 넓이는 "+넓+"입니다.");
		} else if(가==세){
			System.out.println("정사각형의 넓이는 "+넓+"입니다.");
		} else {
			System.out.println("직사각형의 넓이는 "+넓+"입니다.");
		}
		



	}

}
