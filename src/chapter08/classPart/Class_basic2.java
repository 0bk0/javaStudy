package chapter08.classPart;

class Human{
	int age;
	String name;
	
	void intro() {
		System.out.println("안녕, "+age+"살 "+name+"이야.");
	}//별도의 생성자 존재안하면 무조건 1개는 필요해서 기본생성자는 공짜로 만들어짐.
	Human(){
		
	}
	//명시적 생성자 만들기(정의하기)
	Human(String n,int a){
		name = n;
		age = a;
	}
	}
	

public class Class_basic2 {

	public static void main(String[] args) {
		//기본생성자 인스턴스 생성-홍길동,50 값을 넣고 intro() 호출
		//일단 붕어빵 만들어놓고 슈크림(재료) 집어넣기
		Human h1 = new Human(); //1개라도 있어서 기본생성자를 공짜로 안주고 없앰
		h1.name = "홍길동";
		h1.age = 50;
		h1.intro();
		//명시생성자 인스턴스 생성-이순신,50 값을 넣고 intro() 호출
		//슈크림(재료) 집어넣으면서 붕어빵 만들기
		Human h2 = new Human("이순신",50); //해당 2개를 파라미터로 받을 수 있는 것을 만들러 위로 올라감
		h2.intro();

			
		}

	}


