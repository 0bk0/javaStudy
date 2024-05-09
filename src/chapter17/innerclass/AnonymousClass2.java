package chapter17.innerclass;

interface Human6 { // 인스턴스 생성못하는 인터페이스라서 이름만 빌려서 익명객체(lee에다 저장)만 만듦
	void intro();
}

class Anonymous implements Human6 {
	@Override
	public void intro() {
		System.out.println("나는 학생임");
	}
}

public class AnonymousClass2 {

	public static void main(String[] args) {
		Human6 lee = new Human6() {
			@Override
			public void intro() {
				System.out.println("저는 학생임다.");
			}
		};
		lee.intro();

	}

}
