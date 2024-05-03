package chapter10.polymorphism;

class Dog extends Animal {
	void bark() {
		System.out.println("왈알");
	}
}

// 둘다 오버라이딩 안되어있어서 호출시에는 Dog,Dove로 호출해야함
class Dove extends Animal {
	void fly() {
		System.out.println("퍼득 퍼뜩 인나라");

	}
}

public class Instanceof {

	public static void main(String[] args) {
		Dog happy = new Dog();
		Dove donald = new Dove();

		System.out.println(happy instanceof Animal);
		System.out.println(happy instanceof Dog);
		System.out.println(donald instanceof Animal);
		System.out.println(donald instanceof Dove);

		testAnimal(happy);
		// 메인메소드를 호출하는 부분과

	}// 메인메소드 정의하는 부분은 다름
		// ↓Animal로 뭉뚱그려서 호출하기떄문에 안에 무슨 클래스들이 있는지 모름

	public static void testAnimal(Animal animal) {
		Dog myDog = (Dog) animal; // 다운캐스팅
		// Animal 클래스로 표현하기때문에 Dog 클래스에서 bark()는 호출 못함
		// animal.bark → animal에서는 bark의 정의가 안되어있기때문임
		myDog.bark();

		if (animal instanceof Dog) {
			Dog myDog1 = (Dog) animal;
			myDog1.bark();
		} else if (animal instanceof Dove) {
			Dove myDove = (Dove) animal;
			myDove.fly();
		}
		// ↓패턴 매칭(변수 instanceof 타입 캐스팅변수)
		if (animal instanceof Dog myDog1) {
			myDog1.bark();
		} else if (animal instanceof Dove myDove) {
			myDove.fly();
		}
	}

}
