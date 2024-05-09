package chapter17.innerclass;

class Human3 {
	int age;
	Name name;

	static class Name {
		String first;
		String family;

		Name(String first, String family) {
			this.first = first;
			this.family = family;
		}
	}

	Human3(int age, String first, String family) {
		this.age = age;
		this.name = new Name(first, family);
	}

	void intro() {
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}

public class Static_InnerClass2 {

	public static void main(String[] args) {
		Human3 kim = new Human3(29, "상혁", "김");
		kim.intro();

		// 소속만 휴먼3일 뿐(이름만 빌림), 정적 내부 클래스만 생성
		Human3.Name name = new Human3.Name("순신", "이");
		System.out.println("이름: " + name.family + name.first);

	}

}
