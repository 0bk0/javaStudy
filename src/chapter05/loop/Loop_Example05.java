package chapter05.loop;

public class Loop_Example05 {

	public static void main(String[] args) {
		// *반복문 안쪽의 변수는 같은 안쪽에서만 사용가능함(지역변수)
		/*
		 * 1번
		 * 10000
		 * 02000
		 * 00300
		 * 00040
		 * 00005
		 * 
		 * 2번
		 * 12345
		 * 23456
		 * 34567
		 * 45678
		 * 56789
		 */
		//1번: i와 j가 같은 숫자인 자리만 1개씩 증가함(1*1, 2*2...)
		System.out.println("1번");
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				if(i==j) 
					System.out.print(i+" ");
				else 
					System.out.print("0 ");
				
			}System.out.println();
		}
		//2번
		System.out.println("2번");
		for(int i=1;i<=5;i++) {
			for(int j=i;j<i+5;j++) { //j=i; j가 i의 값을 받음 j<i+5; i+5전까지 결과뽑음
				System.out.print(j+" ");
				
			}System.out.println();
		}
	}

}
