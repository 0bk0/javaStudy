package chapter14.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Test {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(2);
		ts.add(5);
		ts.add(1);
		ts.add(4);
		ts.add(2);

		System.out.println(ts.first()); // 최소값 출력
		System.out.println(ts.last()); // 최대값 출력
		System.out.println(ts.contains(2));

		System.out.println("================");
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

		System.out.println("\n================");

		// TreeSet을 이용한 로또
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		for (Integer i : lotto) {
			System.out.print(i + " ");

		}

	}
}
