package chapter05.loop;

public class ForTest1 {

	public static void main(String[] args) {
		int a = 100; //a는 넓은범위에 있기에 잘 출력됨
		
		// for (초기화식;조건식;증강식){}
		for(int i=0;i<=5;i++) {
			System.out.println(a);
			System.out.println(i+"번 학생의 성적처리");
		}
		// System.out.println(i); 작은범위에 있어서 안됨?
		
		int sum=0;
		//합계
		for(int i=0;i<=100;i++) {
			if(i%2==0)
			sum+=i; // sum = sum+i 같은의미
			
		}
		System.out.println("1~100 합계: "+sum);
	
	}
	

}
