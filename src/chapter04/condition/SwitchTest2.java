package chapter04.condition;

public class SwitchTest2 {

	public static void main(String[] args) {
		// 병합처리 예제
		int ranking = 2; //코드가 없어서 다음으로 넘아가기에 3번이 출력됨
		
		switch(ranking) {
			case 1:
				System.out.println("대상");
				break;
			case 2:
			case 3:
				System.out.println("우수상");
				break;
			case 4:
			case 5:
				System.out.println("장려상");
				break;
		}
		
		int days;
		int month=4;
		
		switch(month) {
		case 2:
			days=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		default:
			days=31;
			break;
		}
		System.out.println(month+"월은 "+days+"일까지 있음");
	}

}
