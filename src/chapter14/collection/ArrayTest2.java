package chapter14.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 489쪽 벌크처리
		ArrayList<Integer> arnum = new ArrayList<>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> arnum2 = new ArrayList<>(Arrays.asList(4, 5, 2));
		ArrayList<Integer> arnum3 = new ArrayList<>(Arrays.asList(1, 2));

		// addAll - 합집합
		System.out.print("합집합 → ");
		ArrayList<Integer> arnumAdd = new ArrayList<>(arnum);
		arnumAdd.addAll(arnum2);
		for (Integer i : arnumAdd) {
			System.out.print(i + " ");
		}
		System.out.println();

		// removeAll - 차집합
		System.out.print("차집합 → ");
		ArrayList<Integer> arnumRemove = new ArrayList<>(arnum);
		arnumAdd.addAll(arnum2);
		for (Integer i : arnumRemove) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	// 교집합 사진보셈
	// 부분집합 사진보셈(넘2인지 3인지 비교하면서 부분집합인지 아닌지도 비교해보셈)

}
