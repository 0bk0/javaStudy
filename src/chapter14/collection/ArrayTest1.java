package chapter14.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, 5); // index(2)에 5의 값을 추가함
		for (Integer i : list) {
			System.out.println(i + " ");
			}
			list.remove(0);
			System.out.println();
			for (Integer i : list) {
				System.out.println(i + " ");
			}
			System.out.println();
			System.out.println("get(index): " + list.get(1));
			System.out.println("size(): " + list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i) + " ");

			}

		}

	}


