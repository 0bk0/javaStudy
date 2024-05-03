package chapter13.generic;

import java.util.ArrayList;

public class Generic_test2 {

	public static void main(String[] args) {
		// 제네릭 타입을 명시하지 않을 경우 컴파일 단계에서 에러를 알수 없음
		ArrayList arNum = new ArrayList();
		arNum.add(1); //arNum[0]
		arNum.add("문자열"); //arNum[1]
		int value = (int) arNum.get(0);
		// int temp = (int) arNum.get(1);
		// 문자열로 뽑았는데 정수타입으로 집어넣으려 해서 에러발생함
		
		//데이터 타입을 제네릭타입으로 명시
		ArrayList<Integer> arNum2 = new ArrayList<>();
		arNum2.add(10);
		// arNum2.add("err"); 
		// 컴파일 시점에서 타입체크후 에러발생 = 타입안정성
		int value2 = arNum2.get(0);
		

	}

}
