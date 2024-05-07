package chapter15.exception;

public class Throw_Test1 {

	public static void main(String[] args) {
		// String name = "빌게이츠";
		String name = null; // NullPointerException 메세지 보여줌
		System.out.println("printScore 메서드 실행 전");
		printScore(name);

	}

	static void printScore(String name) {
		System.out.println("printScore 메서드 실행");
		// System.out.println(name.length()); 
		//↓여기서 에러발생하기 때문에 해당 코드를 예외처리한다!!!
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("이름이 무효하다.");
		}
	}

}
