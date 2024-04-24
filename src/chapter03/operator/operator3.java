package chapter03.operator;

public class operator3 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10, num2 = 20;
		
		// and&&
		boolean flag = (num1>0)&&(num2>0);
		System.out.println(flag);
		
		// or||
		flag = (num1>0)||(num2>0);
		System.out.println(flag);
		
		// not!
		System.out.println(!flag);
		System.out.println("----------");

		
		// 논리연산자의 함정
		int num = 10;
		int i = 2;
		boolean value = ((num=num+10)<10)&&((i=i+2)<10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i); //앞에서 이미 false면 뒤에는 계산을 실행안함
		
		num = 10;
		i = 2;
		
		value = ((num=num+10)>10||((i=i+2)<10));
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);


		
	}

}
