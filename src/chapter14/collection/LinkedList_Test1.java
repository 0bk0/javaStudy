package chapter14.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Test1 {

	public static void main(String[] args) {
		LinkedList<String> arNum = new LinkedList<String>();
		arNum.add("김수한무");
		arNum.add("거북이");
		arNum.add("두루미");
		arNum.add(1, "삼천갑자");
		arNum.remove("삼천갑자");

		for (String s : arNum) {
			System.out.println(s);
		}
		// Iterator 반복자
		System.out.println("--------");
		Iterator<String> it = arNum.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Iterator 반복자 - 역순
		System.out.println("--------");
		ListIterator<String> it2 = arNum.listIterator(arNum.size());
		while (it2.hasPrevious()) {
			System.out.println(it2.previous());
		}

	}

}
