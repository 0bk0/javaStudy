package chapter04.condition;

public class IfTest1 {

	public static void main(String[] args) {
		// if
		int age =15;
		
		if (age>=19) {
			System.out.println("성인입니다");
		} // 값이 false이기 때문에 다음으로 넘어감
		
		//if-else
		if(age>=19) {
			System.out.println("성인입니다1");
		} else { // age>19 같은의미
			System.out.println("어린이입니다1");
		}
		
		//if-else-if-else
		if(age>=19) {
			System.out.println("성인입니다2");
		} else if(age>12) { // 19>age>12 같은의미
			System.out.println("청소년입니다2");
		} else { // age=<12 같은의미
			System.out.println("어린이입니다2");
		} // else if에서 조건문이 완성됐기때문에 다음으로 안넘어감
		
		

	}

}
