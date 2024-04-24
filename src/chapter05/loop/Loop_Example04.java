package chapter05.loop;

public class Loop_Example04 {

	public static void main(String[] args) {
		// 
/*
 * 1번
 * 00000
 * 00000
 * 00000
 * 00000
 * 00000
 * 2번
 * 00000
 * 11111
 * 22222
 * 33333
 * 44444
 * 3번
 * 01234
 * 01234
 * 01234
 * 01234
 * 01234
 */
		//1번: 0과 공백의 반복 "0 "
		System.out.println("1번");
		for(int a=0;a<5;a++){
			for(int b=0;b<5;b++) {
				System.out.print("0 ");
			}System.out.println();
		}
		//2번 a=세로 b=가로 
		System.out.println("2번");
		for(int a=0;a<5;a++){
			for(int b=0;b<5;b++) {
				System.out.print(a+" ");
			}System.out.println();
		}
		
		//3번
		System.out.println("3번");
		for(int a=0;a<5;a++){
			for(int b=0;b<5;b++) {
				System.out.print(b+" ");
			}System.out.println();
		}
		}
	}

		
	

