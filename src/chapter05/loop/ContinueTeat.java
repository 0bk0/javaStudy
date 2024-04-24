package chapter05.loop;

public class ContinueTeat {

	public static void main(String[] args) {
		// 컨티뉴
		for(int i=1;i<=10;i++) {
			if(i==7)
				continue; //를 기점으로 위까지만 실행 아래 식들은 상관치않음
			System.out.println("반복회차: "+i);
		}
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2 !=0)
				continue;
			sum+=i;
		}
		System.out.println("짝수의 합: "+sum);
	}

}
