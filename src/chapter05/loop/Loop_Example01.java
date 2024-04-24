package chapter05.loop;

public class Loop_Example01 {

	public static void main(String[] args) {
		// 계속 같은 변수 i로 써도 됨(매번 초기화하기때문)
/*
 * 출력결과:
 * 0123456789
 * 12345678910
 * 13579
 * 0246810
 * 102030405060708090100
 * 54321
 * 100001000100101
 */
		int i;
		for(i=0;i<10;i++) {
		System.out.print(i+" ");
		}
		
		System.out.println("");
		
		int a;
		for(a=1;a<11;a++) {
		System.out.print(a+" ");
		}
		
		System.out.println("");

		int b;
		for(b=1;b<10;b=b+2) {
		System.out.print(b+" ");
		}
		
		System.out.println("");

		int c;
		for(c=0;c<=10;c=c+2) {
		System.out.print(c+" ");
		}
		
		System.out.println("");

		int d;
		for(d=10;d<=100;d=d+10) {
		System.out.print(d+" ");
		}
		
		System.out.println("");

		int e;
		for(e=5;e>=1;e--) {
		System.out.print(e+" ");
		}
		
		System.out.println("");

		int f;
		for(f=10000;f>=1;f=f/10) {
		System.out.print(f+" ");
		}
	}

}
