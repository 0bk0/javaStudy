package chapter14.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Person {name= " + name + ", age= " + age + "]";
	}
}

class MyComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name); // String 클래스에서 정의된 compareTo
		// 역순하려면 맨뒤에 *-1 붙이면 됨
	}
}

public class Comparator_Test {

	public static void main(String[] args) {
		Set<Person> set1 = new TreeSet<>(new MyComparator());
		set1.add(new Person("홍길동", 30));
		set1.add(new Person("강감찬", 50));
		set1.add(new Person("이순신", 90));

		for (Person person : set1) {
			System.out.println(person);
		}

	}

}
