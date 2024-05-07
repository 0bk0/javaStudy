package chapter15.exception;

public class Throw_Test3 {

	public static void main(String[] args) {
		String name = null;
		try { // 1.밀었으니까 여기서 try-catch로 처리함
			printScore(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ㅎㅎ");
	}

	static void printScore(String name) throws Exception // 1.throws로 밀어버리거나
	{
		if (name == null) {
			// 2.try-catch 해주거나
			throw new Exception("이름이 무료");
			// 예외 발생했는데 왜 처리안함? = 컴파일에러
		}
		System.out.println(name.length());
	}

}
