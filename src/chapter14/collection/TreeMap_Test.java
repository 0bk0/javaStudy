package chapter14.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Test {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(1, "부산");
		treeMap.put(2, "인천");
		treeMap.put(3, "대구");
		treeMap.put(4, "대전");
		treeMap.put(5, "광주");
		treeMap.put(6, "울산");
		// 요소 개수
		int size = treeMap.size();
		System.out.println(size);
		// 객체 찾기
		Object object = treeMap.get(1);
		System.out.println(object);
		// 객체 삭제
		treeMap.remove(1);
		// key를 요소로 가지는 set 생성
		Set<Integer> keySet = treeMap.keySet();
		System.out.println(keySet);
		// vlaue 값 읽기
		Iterator<Integer> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			String value = treeMap.get(key);
			System.out.printf("키: %d, 값: %s\n", key, value);
		}

	}

}
