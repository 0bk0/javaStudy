package chapter04.condition;

import java.util.Scanner;

public class SwitchEaxmple01 {

	public static void main(String[] args) {
		// 예제
/*
 * 출생연도 입력받아 띠를 출력한다
 * 띠는 12개, 연도를 12로 나누었을때 나머지값에 따라 아래와 같이 구분함
 * 원숭이0
 * 닭1
 * 개2
 * 돼지3
 * 쥐4
 * 소5
 * 호랑이6
 * 토끼7
 * 용8
 * 뱀9
 * 말10
 * 양11
 * 출력결과:
 * 	연도를 입력하세요:2001
 * 	2001년생은 뱀띠입니다.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요: ");
		int y = scan.nextInt();
		String result = ""; //초기화 시키기
		
		switch(y%12) {
		case 0:
			result="원숭이띠";
			break;
		case 1:
			result="닭띠";
			break;
		case 2:
			result="개띠";
			break;
		case 3:
			result="돼지띠";
			break;
		case 4:
			result="쥐띠";
			break;
		case 5:
			result="소띠";
			break;
		case 6:
			result="호랑이띠";
			break;
		case 7:
			result="토끼띠";
			break;
		case 8:
			result="용띠";
			break;
		case 9:
			result="뱀띠";
			break;
		case 10:
			result="말띠";
			break;
		case 11:
			result="양띠";
			break;

		}
		System.out.println(y+"년생은 "+result+"입니다.");
		

	}

}
