package chapter08.classPart;

import java.util.Scanner;

	//class Theater_Method {} → 이렇게도 사용가능한데 보통은 클래스 따따로 만듦

public class Theater {
	/*
	 * 극장 좌석 예약 프로그램 만들기 1. Theater, Theater_Method 두개의 클래스를 생성하여 기능을 분리한다. 2.
	 * Theater클래스에서는 main()메서드를 포함하며 출력문구를 사용하지 않는다. 3. Theater_Method의 멤버변수 혹은
	 * 멤버메서드를 호출하여 출력문구 및 로직을 처리한다.
	 * 
	 * Theater main() : 메뉴를 종료를 선택하기 전까지 반복하여 보여주고 선택된 번호에 따라 기능을 수행한다.
	 * 
	 * Theater_Method 멤버 변수 외부에서의 데이터의 접근을 막기 위해 다음과 같이 선언한다. private int[][] seats
	 * = new int[7][7];
	 * 
	 * 멤버 메서드 1. printMenu() : 극장 좌석의 예약 현황을 보여준다. 2. inputCnt() : 예약할 좌석의 개수를 입력받아
	 * 반환한다. 3. seatInfo() : 2차원배열을 이용하여 극장 좌석의 예약현황을 보여준다. (예약 X : 1, 예약 O : 0) 4.
	 * reservationSeats(int cnt) : 예약할 좌석의 개수를 매개변수(parameter)로 받고 그 횟수만큼 행과 열의 값을
	 * 입력받는다. a. 예약이 되어 있지 않을 경우(해당 행과 열의 값이 0일때), 해당 행과 열의 값을 1로 변경하고, "예약되었습니다."라는
	 * 문구를 출력한다. b. 예약이 되어 있는 경우(해당 행과 열의 값이 0일때), "x행x열은 예약된 좌석입니다."라는 문구를 출력하고, 다시
	 * 행과 열을 입력 받는다.
	 */

	public static void main(String[] args) {
		Theater_Method tm = new Theater_Method();
		//↑다른 클래스에 정의된 것을 여기서 인스턴스화(실체화)해준다

		Scanner scan = new Scanner(System.in);
		int num = 0, row = 0, col = 0, cnt = 0;

		// "◆극장 정보 예약시스템◆" ← 이거 하나 출력하려고 메소드 만드는 건 좀 비효율적
		//따라서, 파라미터로 1과 2로 나눠서 각각 출력되는 값이 다르게 나타낼 수 있음
		tm.Textprint(1);
		while (true) { //while문은 true일 때 무한반복이기때문에 !조건!이 필요함
			tm.printMenu(); // 메뉴 정보 보여주는 메서드 호출 *여기서 부르면 된다*
			num = scan.nextInt();
			switch (num) { //if문이든 switch-case문이든 둘다 사용가능함
			case 1: // 좌석 정보 확인하는 메서드 호출
				tm.seatInfo();
				break;
			case 2: // 좌석 예약 실행하는 메서드 호출
				cnt = tm.inputCnt();
				tm.reservationSeats(cnt);
				break;
			case 0: //반복문 종료
				tm.Texit(); //"프로그램을 종료합니다."
				System.exit(0); //리턴 써도 되나봄
			default: // 1,2,0이 아니면 오류메세지 출력하는 메서드 호출
				tm.Textprint(2); //"오류입니다. 1,2,0중에 다시입력하세요."
				break;
			}
		}
		// int a = tm.b("cc"); → 문자열을 정수로 받아주겠다? 식 자동완성: 단축키 ctrl+1

	}

}
