package chapter15.exception;

public class Throw_Test2 {

	public static void main(String[] args) {
		String name = null; // NullPointerException 메세지 보여줌
		try {
			printScore(name);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	static void printScore(String name) 
			throws NullPointerException // 던지기? - 예외 미루기
										// 내가 해결은 안하고 에러발생구문 호출하는 쪽에서 에러처리함
	{

		if (name == null) {
			// 예외 생성
			throw new NullPointerException("이름이 무료");
		}
		System.out.println(name.length());

	}
}
