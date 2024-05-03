package chapter09.inheritance;

class human3 { // 멤버변수
	int age;
	String name;

	human3(int age, String name) { // 명시적 생성자
		this.age = age;
		this.name = name;
	}

	void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야.");
	}
}

class student3 extends human3 { // extends로 상속받기
	int stNum;
	String major;

	student3(int age, String name, int stNum, String major) {
		super(age, name); //
		this.stNum = stNum;
		this.major = major;
	}

	@Override
	void intro() { // 부모클래스의 intro()를 !재정의!
		System.out.println(major + "학과 " + stNum + "학번 " + name + "입니다.");
	}

	void study() {
		System.out.println("스터디 스터디");
	}

}

public class Overriding2 {

	public static void main(String[] args) {
		human3 kim = new human3(29, "김상혁");
		kim.intro();

		human3 lee = new student3(42, "이승우", 9312345, "컴공");
		lee.intro();
		// lee.study();
		// human3에서는 정의가 되어있지 않아서 오류발생

	}

}
