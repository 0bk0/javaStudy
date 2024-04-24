package chapter03.operator;

public class operator4 {

	public static void main(String[] args) {
		// 삼항 연산자, 조건 연산자
		// 조건식?결과1:결과2
		int fatherage = 45;
		int motherage = 47;
		
		String s = (fatherage>motherage)? "아빠가 연상":"엄마가 연상";
		System.out.println(s);
		
		int x = 10 > 3 ? 10 : 2;
		

	}

}
