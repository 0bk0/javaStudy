package chapter16.ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8480652433379708103L;
	String name;
	transient String job; // transient 직렬화 제외대상   

	public Person() {
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;

	}

	@Override
	public String toString() {
		return name + ", " + job;
	}
}

public class Serializable_Test {

	public static void main(String[] args) throws Exception {
		Person personAhn = new Person("안국밥", "중식");
		Person personkim = new Person("김순대", "석식");

		// 직렬화
		try (FileOutputStream fos = new FileOutputStream("serial.out"); // 직렬
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // 객체 직렬
			oos.writeObject(personAhn);
			oos.writeObject(personkim);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 역직렬화
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
