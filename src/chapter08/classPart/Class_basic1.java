package chapter08.classPart;

class Car{
	//멤버 변수=속성=필드(클래스 안에 만들어진 것)
	String name;
	boolean gasoline;
	//생성자
	Car(){
		System.out.println("기본생성자호출");
	}
	//명시적 생성자
	Car(String name1, boolean gasoline1){ //문자형, 불린형
		name=name1;
		gasoline=gasoline1;
		System.out.println("명시적생성자호출");
	}
	//멤버 메서드
	void run() {
		if(gasoline) {
			System.out.println("부릉부릉");
		}else {
			System.out.println("덜컹덜컹");
		}
	}
	void stop() {
		System.out.println("끼이익");
	}
}

public class Class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도c";
		korando.gasoline = false;
		System.out.println(korando.name);
		korando.run();
		
		Car equus = new Car("에쿠스",true); // 문자형, 불린형
		System.out.println(equus.name);
		equus.run();
				

	}

}
