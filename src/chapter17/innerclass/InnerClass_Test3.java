package chapter17.innerclass;

class Name {
	String first;
	String family;

	Name(String first, String family) {
		this.first = first;
		this.family = family;
	}
}

class Human {
	int age;
	Name name;

	class Name {
		String first;
		String family;

		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}

		void outAge() { // 휴먼 클래스의 내부 네임클래스의 메서드
			System.out.println("저는 " + age + "살입니다.");
		}

		// 네임 클래스가 가지고 있는거(아래 2개)
		void outwho() {
			Util.outHuman(Human.this);
			
			//this로 2가지를 표현할 수 있는 이유는 안쪽에 있기 때문에
			System.out.println(this);
			System.out.println(Human.this);
		}

		@Override
		public String toString() {
			return "Name객체";
		}
	}

	@Override // 휴먼클래스가 가지고 있는거
	public String toString() {
		return "Human객체";
	}

	Human(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}

	void intro() { // 휴먼 클래스의 메서드
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

class Util {
	static void outHuman(Human who) {
		who.intro();
	}
}

public class InnerClass_Test3 {

	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		kim.name.outAge();
		kim.name.outwho();
	}

}
