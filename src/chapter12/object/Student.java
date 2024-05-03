package chapter12.object;

public class Student {
	String name;
	int stnum;

	Student() {
	} // 기본생성자

	Student(String name, int stnum) { // 명시생성자
		this.name = name;
		this.stnum = stnum;
	}

	@Override
	public int hashCode() {
		return this.stnum = stnum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student s = (Student) obj;
		if (this.stnum != s.stnum)
			return false;
		return true;
	}
}
