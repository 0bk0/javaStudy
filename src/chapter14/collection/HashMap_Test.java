package chapter14.collection;

import java.util.HashMap;

public class HashMap_Test {

	public static void main(String[] args) {
		// HashMap 데이터의 추가, 삭제 특히 검색이 빠르다는 장점
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어땅콩", 2500);
		snack.put("감자깡", 1900);
		snack.put("핫브레이크", 450);
		snack.put("빼뺴로", 900);

		String Mysnack = "감자깡";
		System.out.println(Mysnack + "의 가격은 " + snack.get(Mysnack));

		snack.remove("빼빼로"); // key와 일치하는 데이터 삭제
		System.out.println(snack.containsKey("빼빼로"));
		snack.replace("감자깡", 3000); // key와 일치하는 value 값 변경
		System.out.println(snack.get("감자깡"));
		System.out.println(snack.isEmpty());

	}

}
