package chapter15.exception;

class NetAccess implements AutoCloseable {
	public void open() {
		System.out.println("접속");
	}

	public void send() {
		System.out.println("전송");
	}

	@Override
	public void close() {
		System.out.println("해체");
	}

}

public class AutoClose_Test {

	public static void main(String[] args) {
		// finally가 아니어도 실행되는 구문
		// try-with-resources
		try (NetAccess na = new NetAccess()) { //자원을 할당하는 클래스들?
			na.open();
			na.send();
		} catch (Exception e) {

		} finally {
			System.out.println("finally 실행");
		}

	}

}
