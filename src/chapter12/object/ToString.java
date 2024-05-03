package chapter12.object;

public class ToString {

	public static void main(String[] args) {
		int i = 1234;
		System.out.println(i);
		
		Human kim = new Human(29,"김상횽");
		System.out.println(kim);
		//인스턴스 자체 출력 시 해당 객체의 정보+해시코드 보여줌
		
		String str = "범인: "+kim;
		//!kim.toString()!이 없어도 똑같이 나옴
		System.out.println(str);

	}

}
