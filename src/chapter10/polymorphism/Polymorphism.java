package chapter10.polymorphism;

class Animal {
	void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	void move() {
		System.out.println("사람이 두발로 움직인다.");
	}
}

class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	void move() {
		System.out.println("독수리가 날아다닙니다.");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * movePrint(new Tiger()→인스턴스 찍어내는 부분); //↑Tiger t = new Tiger();와 같음(객체) new
		 * Tiger()를 t에 저장해서 불러오는 방식 movePrint(new Human());→*생성만 하고 movePrint로 보내는 방식
		 * movePrint(new Eagle()); //↑메소드 호출부분: 중괄호 없음
		 */
		// 다형성
		Animal a = new Tiger();
		Animal b = new Human();
		Animal c = new Eagle();

		movePrint(a);
		movePrint(b);
		movePrint(c);
		// movePrint(new Tiger());와 같음
	}

	// 메서드
	public static void movePrint(Animal a) {
		a.move();
	}
	/*
	 * //메커니즘이 같기때문에 결과는 똑같이 나옴 위의 방식이 메소드를 몇개를 만들어도 상위클래스만 호출하면 다 뽑을 수 있어서 편하다는 듯
	 * public static void movePrint(Tiger t) { //static을 사용하면 객체없이 소환 가능함 t.move();
	 * } public static void movePrint(Human h) { h.move(); } public static void
	 * movePrint(Eagle e) { e.move(); }
	 */

}
