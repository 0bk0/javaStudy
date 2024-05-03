package chapter09.inheritance;

class Human { //==부모클래스
	int age;
	String name;

	Human(int age, String name) {
		System.out.println("==Human 생성자==");
		// 상속받았기때문에 Human 생성자도 한번 더 출력됨
		this.age = age;
		this.name = name;
		// 해당과정을 초기화라고 했었음
	}

	public void intro() {
		System.out.println("안녕, " + age + "살 " + name + "이야.");
	}
}

// Student는 현재 Human에서 상속받고 있음
class Student extends Human { // extends 상속받는 예약어 = Human 클래스를 호출함
	int stNum;
	String major;

	Student(int age, String name, int stNum, String major) {
		// super(age, name); = 상위클래스를 부른다
		super(age, name);
		this.stNum = stNum; // this.~~ = 자기자신을 부른다
		this.major = major;
		System.out.println("==Student 생성자==");
	}

	public void study() {
		System.out.println("스터디 스터디");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Human kim = new Human(29, "홍길동"); // 붕어빵틀:클래스/붕어빵:인스턴스
		// 명시적 생성자라 이미 재료 넣고 붕어빵을 굽는다는 의미
		kim.intro();

		Student lee = new Student(33, "이순신", 20241001, "경영");
		lee.intro();
		lee.study();

	}

}
