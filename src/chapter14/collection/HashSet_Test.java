package chapter14.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {

	public static void main(String[] args) {
		/*
		  Set 
		  - 객체를 중복해서 저장할 수 있으며, null값이라도 하나만 저장가능 
		  - 중복을 자동으로 제거 
		  - 순서를 보장하지 않음
		 */
		HashSet<String> kangwon = new HashSet<>();
		kangwon.add("춘천시");
		kangwon.add("철원군");
		kangwon.add("정선군");
		kangwon.add("강릉시");
		kangwon.add("화천군");
		kangwon.add("춘천시"); // 중복데이터

		Iterator<String> it = kangwon.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------");
		System.out.println(kangwon.size()); //요소개수 반환
		System.out.println(kangwon.contains("화천군")); //데이터있는지 체크
		kangwon.remove("정선군"); //해당 객체 제거
		kangwon.clear(); //모든 값 제거
		
		for (String s : kangwon) {
			System.out.println(s);
		}


	}

}
