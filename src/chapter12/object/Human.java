package chapter12.object;

public class Human {
	int age;
	String name;

	public Human(int age, String name) {//명시생성자
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age+"세의 "+name;
		//return super.toString();
		//↓!super.toString()!부분에 뭐라고 쓰든간에 문자열이면 됨
	}
	
}
