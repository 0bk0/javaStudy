package chapter04.condition;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class If_Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 윤년 구하기
 * 연도를 입력받고 입력받은 연도가 평년인지 윤년인지를 출력한다.
 * 연수가 4로 나누어 떨어지면서 연수가 100으로 나누어 떨어지지 않거나
 * 연수가 400으로 나누어 떨어지는 해 = 윤년
 * 출력결과:
 * 연도:2008
 * 윤년
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도: ");
		int y = scan.nextInt();
		String result = "평년"; // 변수 이용 방법
		
		if((y%4==0 && y%100!=0) || y%400==0)
			result = "윤년";
			System.out.println(result);
		
		//스캐너(기본형데이터타입)방식이랑 똑같음(참조형데이터타입)
		GregorianCalendar gc = new GregorianCalendar();
		String result2 =
				gc.isLeapYear(y)? "윤년":"평년";
		System.out.print(result2);

		
		


		}
	}


