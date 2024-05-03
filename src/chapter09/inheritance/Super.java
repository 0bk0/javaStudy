package chapter09.inheritance;

import java.time.LocalDate;

class human2 { // 멤버변수
	int age;
	String name;

	human2(int age, String name) { // 명시적 생성자
		this.age = age;
		this.name = name;
	}

	human2(float brith, String name) { // 명시적 생성자
		this(0, name); // 생성자 호출 this==human2
		// age값에 임의의 정수값인 0으로 초기화시킴
		// 어차피 나중에 값이 들어가기때문에
		LocalDate now = LocalDate.now();
		this.age = now.getYear() - (int) brith + 1;
		// int로 강제 형변환이라 연도만 출력됨
		System.out.println(now.getYear());
		System.out.println((int) brith);
		// ↑확인용

	}

	public void intro() { // 멤버 메서드
		System.out.println("안녕, " + age + "살 " + name + "이야.");
	}

}

class student2 extends human2 { // extends로 상속받기
	int stNum;
	String major;

	student2(int age, String name, int stNum, String major) {
		super(age, name); // super==student2
		this.stNum = stNum;
		this.major = major;
	}

	student2(float brith, String name, int stNum, String major) {
		super(brith, name);
		this.stNum = stNum;
		this.major = major;
		// brith는 저장하고자 하는 값이 아닌 파라미터임
		// 나이를 계산하기 위해서 생년월일을 받은 것뿐
	}
}

public class Super {

	public static void main(String[] args) {
		student2 no = new student2(39, "노홍철", 9908123, "건축");
		no.intro();
		student2 bea = new student2(1989.10f, "백지영", 1125034, "건축rk");
		bea.intro();

	}

}
