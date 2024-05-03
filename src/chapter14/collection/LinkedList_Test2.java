package chapter14.collection;

import java.util.LinkedList;

public class LinkedList_Test2 {

	public static void main(String[] args) {
		LinkedList<String> arNum = new LinkedList<String>();
		// 추가
		arNum.add("장보고");
		arNum.add("김유신");
		arNum.add("강감찬");
		arNum.add("을지문덕");
		arNum.addLast("곽재우"); // LinkedList 맨 뒤 추가
		arNum.addFirst("이순신"); // LinkedList 맨 앞 추가

		for (String name : arNum) {
			System.out.println(name + " ");
		}
		System.out.println("\n------------");

		// 검색
		System.out.println(arNum.size()); // 저장된 객체의 개수 반환
		System.out.println(arNum.isEmpty()); // LinkedList가 비어있는지 확인
		System.out.println(arNum.indexOf("강감찬")); // 지정된 객체의 위치 반환
		System.out.println(arNum.get(3)); // 지정된 위치에 저장된 객체 반환

		// 변경
		arNum.set(0, "광개토대왕");

		for (String name : arNum) {
			System.out.println(name + " ");
		}
		System.out.println("\n-----------");

		// 제거
		arNum.removeFirst(); // 첫번째 노드 제거
		arNum.removeLast(); // 마지막 노드 제거
		arNum.remove(2); // index 위치 객체 제거
		arNum.remove("을지문덕"); // 지정된 객체 제거

		for (String name : arNum) {
			System.out.println(name + " ");
		}
		System.out.println("\n-----------");

	}

}
