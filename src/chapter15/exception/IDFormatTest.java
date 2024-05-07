package chapter15.exception;

import java.util.Scanner;

class IDFormatException extends Exception {
	IDFormatException(String message) { // 해당 값에서 파라미터 받아오겠다 뭐라고 했는데
		super(message);
	}
}

public class IDFormatTest {
	String userID;

	public void checkUserID(String userID) throws IDFormatException {
		// 사용자 정의 예외 클래스 IDFormatException
		// userID가 null → err "아이디는 null일 순 없다고" 출력
		// userID가 8자~20자가 아닌 경우 → err "아이디는 8자 이상 20자 이하로 써야한다고" 출력
		this.userID = userID;
		if (userID == null)
			throw new IDFormatException("아이디는 null일 순 없다고");
		else if ((userID.length() < 8 || userID.length() > 20))
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 써야한다고");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IDFormatTest test = new IDFormatTest();

		System.out.println("ID: ");
		String userID = scan.next(); // null;

		try { // try-catch가 만들어졌기때문에 실행넘겨버려야함
			test.checkUserID(userID);
			System.out.println(test.userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
