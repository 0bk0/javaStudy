package chapter05.loop;

public class Loop_Example06 {

	public static void main(String[] args) {
		// 결과가 나온게 웃김
/*
 * 1번
 * *
 * **
 * ***
 * ****
 * *****
 * 2번
 * *****
 * ****
 * ***
 * **
 * *
 */
		//1번
		System.out.println("1번");
		for(int a=0;a<5;a++) {
			for(int b=0;b<=a;b++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		//2번: 반대로 5부터 1개씩 떨어짐
		System.out.println("2번");
		for(int a=5;a>0;a--) {
			for(int b=0;b<a;b++) {
				System.out.print("*");
			}
		System.out.println();
			
		}
	}

}
