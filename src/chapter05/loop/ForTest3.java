package chapter05.loop;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i;
		
		for(i=0;i<100;i++) {
			sum = sum+i;
			if(sum>100) break;
		}
		System.out.println("합계가 100이 넘는 시점은 "+i+"입니다");
	}

}
