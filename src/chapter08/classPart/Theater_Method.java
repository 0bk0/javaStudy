package chapter08.classPart;

import java.util.Scanner;

public class Theater_Method {

	// 멤버 변수
	private int[][] seats = new int[7][7];
	static Scanner scan = new Scanner(System.in);

	// 메서드
	public void printMenu() { //*여기서 만들어두고*
		System.out.print("""
		메뉴의 번호를 선택해 주세요.
		===================
		1. 좌석 확인
		2. 좌석 예약
		0. 종   료
		===================
		번호를 선택하세요:  """);

	}

	public int inputCnt() {
		System.out.print("몇개의 좌석을 예약하시겠습니까?");
		int cnt = scan.nextInt();
		//int result = 0; result = sc.nextInt(); return result; 해도 됨
		return cnt;

	}

	public void seatInfo() {
		System.out.print("""
				※좌석 예약 정보
				----------------------
				   1 2 3 4 5 6 7
				----------------------
				""");
		for (int i = 0; i < 7; i++) { //중간은 i < seats.length;와도 같음
			System.out.print((i+1)+"| ");
			for (int j = 0; j < 7; j++) { //중간은 j < seats[j].length;와도 같음
				System.out.print(seats[i][j]+" ");
			}
			System.out.println(); // 개행함
		}

	}

	public void reservationSeats(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print("예약할 좌석의 행: ");
			int x = scan.nextInt() - 1; //x == row
			System.out.print("예약할 좌석의 열: ");
			int y = scan.nextInt() - 1; //y == col
			//↓스캔에 말고 if 조건에 [x-1][y-1]해도 됨
			if (seats[x][y] == 1) { // 이미 예약된 자리일때
				//(seats[x-1][y-1] == 0)
				System.out.println(x + "행" + y + "열은 예약된 좌석입니다.");
				i--; // while문으로도 사용가능
			} else {
				seats[x][y] = 1;
				//seats[x-1][y-1] = 1;
				System.out.println("예약되었습니다.");
			}

		}
	}
	//안내문구만 출력하는 메소드
	public void Texit() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void Textprint(int num) {
		if(num==1) {
			System.out.println("◆극장 정보 예약시스템◆");
		}else if(num==2) {
			System.out.println("오류입니다. 1,2,0중에 다시입력하세요.");

	}
	}
}
