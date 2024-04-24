package chapter06.array;

import java.util.Iterator;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 선언(이름만 지음)
		int[] arr0;
		int[] arr00;
		//배열 초기화(방 5개만 만들음)
		int[] arr1 = new int[5]; //타입[] 배열명;
		int arr2[] = new int[5]; //타입 배열명[];
		
		//값을 집어넣음
		int[] arr3 = new int[] {0,1,2,3,4};
		int arr4[] = {0,1,2,3,4};
		
		//배열 자료형 선언
		int[] arr5;
		arr5 = new int[] {6,7,8}; //arr3이랑 같음. 미리 선언한 것뿐
		
		// 주의:먼저 선언하면 new int[]생략할 수 없음
		/*	int arr6[];
		arr6 = {9,10,11}; */
		
		for(int i=0;i<arr3.length;i++) //0번방부터 하나씩 증가하는 값 보여줌
		{	System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("arr3 길이: "+arr3.length);
		
		System.out.println("-----------");

		//선언 후 할당
		int[] score = new int[5];
		score[0]=88;
		score[1]=99;
		score[2]=70;
		score[3]=55;
		score[4]=100;
		// 이때,존재하지않는 5번 방을 만들고 출력하면 에러발생함
		System.out.println(score[0]);
		System.out.println(score[3]);
		
		System.out.println("-----------");

		for(int i=0;i<score.length;i++){
			System.out.println(
				(i+1)+"번 학생의 성적: "+score[i]
						);

	}		System.out.println("-----------");

		// 초기화
		int[] score2 = new int[] {88,99,70,50,100};
		
		for(int i=0;i<score2.length;i++) {
			System.out.println(
					(i+1)+"번 학생의 성적: "+score2[i]
);
		}
	}

}
