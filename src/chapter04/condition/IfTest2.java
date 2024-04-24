package chapter04.condition;

public class IfTest2 {

	public static void main(String[] args) {
		// if block(명령어 딱 한줄만 작동한다)
		int age=15;
		
		if(age>=19) {
			System.out.println("성인임");
			System.out.println("술집입장");
		} // 중괄호 사용
		System.out.println("----------");
		
		if(age>=19)
			System.out.println("성인임2");
			System.out.println("술집입장2");
			// 중괄호 사용X

	}

}
