package chapter15.exception;

public class Exception_Test2 {

	public static void main(String[] args) {
		// 다중 예외 처리(출력되는 순서 확인)
		int a, b, c;
		a = 5;
		b = 2;
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			c = a / b;
			System.out.println("c= " + c);
			arr[5] = 100;
			System.out.println("arr[5]= " + arr[5]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 예외 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자가 배열 범위를 넘음");
		} catch (Exception e) { //Exception을 가장 맨위로 올려서 순서를 바꾸면 오류발생
								//왜?상속관계 생각하면 됨(사진있음)
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 실행 완료");

	}

}
