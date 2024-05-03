package chapter14.collection;

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member> {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name= " + name + ", age= " + age + "]";
	}

	@Override
	public int compareTo(Member m) {
		return (this.name.compareTo(m.name));
	}
}

public class Comparable_Test {

	public static void main(String[] args) {
		// 705 page
		// 객체의 비교를 하기위한 interface
		// Comparable(자기 자신과 비교), Comparator(남을 두개 비교)
		Set<Member> set = new TreeSet<>(); 
		//TreeSet은 정렬을 할수있는 기준(Comparable의 인터페이스)이 있어야 사용가능한 이진트리임
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 50));
		set.add(new Member("이순신", 35));

		for (Member member : set) {
			System.out.println(member);

		}

	}

}
