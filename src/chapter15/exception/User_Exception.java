package chapter15.exception;

//사용자 정의 예외 클래스(실제로 네거티브 어쩌구 클래스는 없는데 지금 만든 것임
class NegativeException extends Exception {
	NegativeException() {
		super("음수는 안된다고 했잖아");

	}
}

public class User_Exception {
	public static void main(String[] args) {
		// 사용자 정의 예외
		int sum = 0;

		try {
			sum = calcSum(-100); // 100 or -100
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static int calcSum(int to) throws NegativeException {
		if (to < 0) {
			throw new NegativeException();
		}
		int sum = 0;
		for (int i = 0; i < to; i++) {
			sum += i;

		}
		return sum;
	}

}
