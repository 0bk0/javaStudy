package chapter14.collection;

import java.util.ArrayList;

record Student(String name,int stnum) {}

public class ArrayTest3 {

	public static void main(String[] args) {
		ArrayList<Student> stlist = new ArrayList<>();
		stlist.add(new Student("홈김동",20240001));
		stlist.add(new Student("길김동",20240002));
		stlist.add(new Student("이김동",20240003));
		
		for (int i = 0; i < stlist.size(); i++) {
			System.out.println(stlist.get(i));
			
		}



	}

}
