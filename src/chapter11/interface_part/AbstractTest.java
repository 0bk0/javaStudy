package chapter11.interface_part;

abstract class animal {
	// 멤버변수
	String name;

	// 생성자
	animal(String name) {
		this.name = name;
	}

	// 멤버메서드
	void alive() {
		System.out.println("생물");
	}

	// 추상메서드
	abstract void move();
}

//abstract 안쓰면 추상메서드 무조건 상속받아야한다고 오류표시줌
abstract class human extends animal {
	human(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("사냥 시작이다");
	}

	abstract void play();
}
class student extends human {
	student(String name) {
		super(name);
	}
	@Override
	void play() {
		System.out.println("일단 밥부터 먹자고");
	}
}
class tiger extends animal {
	tiger(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("배고프다");
	}
}

class eagle extends animal {
	eagle(String name) {
		super(name);
	}

	@Override
	void move() {
		System.out.println("진짜 너무 배고프다");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		/*
		 * 추상클래스 
		 * 1. 추상메서드를 가지고 있는 클래스는 abstract 에약어를 사용 
		 * 2. 추상클래스는 객체를 생성할 수 없음(미완성 클래스라서) 
		 * 3. 상속을 통해서만 사용함(추상클래스는 상속을 위해 만들어진 클래스) 
		 * 4. 추상메서드가 있는 추상클래스를 상속받는 하위클래스는 !반드시! 추상메서드를 override 해야함 
		 * 추상클래스는 extends 를 사용하여 자신의 기능들을 하위클래스로 확장시키는 느낌
		 */
		/*
		 * animal a = new animal();
		 * a.move(); 
		 * → 구현되지 않은 추상메서드가 존재해서 오류남 
		 * ,그래서 애초에 인스턴스 못 만들게 막아둠
		 */
		//animal b = new human("배고픈 사람");
		animal b = new student("배고픈 학생은 바로 나야");
		animal c = new tiger("배고픈 호랑이");
		animal d = new eagle("배고픈 독수리");

		b.alive();
		b.move();
		c.move();
		d.move();

	}

}
