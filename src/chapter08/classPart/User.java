package chapter08.classPart;

public class User {
	String name;
	int age;
	//자동완성-우클릭 soure-generate constructor...
	//↓생성자 자동으로 만들어줌
	public User(String name1, int age1) { //두개의 값을 파라미터로 하는 생성자
		name = name1;
		age = age1;
	}

	public User() { //기본생성자
		super();
	}

	public User(String name) { //명시생성자-한개의 값을 파라미터로
		super();
		this.name = name;
	}

	public void userInfo() {
		System.out.println("이름: "+name+", 나이: "+age);
		
}


}
