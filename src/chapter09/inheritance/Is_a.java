package chapter09.inheritance;

class Animal{
	String name;
	void move() {
		System.out.println("움직이다");
	}
}
class Human4 extends Animal{
	@Override
	void move() {
		System.out.println("걷다");
	}
}

public class Is_a {

	public static void main(String[] args) {
/*
	is a relation
	상속 관계, 다중 상속X
 */
		Animal a = new Human4(); //사람 is a 동물: 가능함
		// Human4 b = new Animal();
		// 동물 is a 사람: 불가능함 에러발생
		//==부모클래스의 실체를 자식으로는 표현할수 없기때문?
		

	}

}
