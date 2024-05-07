package chapter15.exception;

public class Exception_Test3 {

	public static void main(String[] args) {
		// 테스트 2랑 같은 코드
		int a, b, c;
		a = 5;
		b = 2;
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			c = a / b;
			System.out.println("c= " + c);
			arr[5] = 100;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로 나누기 또는 배열 범위 초과 예외 발생");
		} catch (Exception e) {
			System.out.println("Exception을 상속받는 모든 예외 중 발생");
		}
		System.out.println("프로그램 실행 완료");
	}

}
