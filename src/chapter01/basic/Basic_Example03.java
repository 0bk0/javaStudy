package chapter01.basic;

public class Basic_Example03 {

	public static void main(String[] args) {
		// 변수의 교환
		int x = 200, y = 100;
		System.out.println("교환전");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		//순서가 중요하기때문에 새로운 변수를 넣음
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("교환후");
		System.out.println("x= "+x);
		System.out.println("y= "+y);


	}

}
