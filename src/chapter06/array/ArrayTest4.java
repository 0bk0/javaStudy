package chapter06.array;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {88,94,72,74,23};
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("총점: "+sum);
		System.out.println("평균: "+(float)sum/score.length);

	}

}
