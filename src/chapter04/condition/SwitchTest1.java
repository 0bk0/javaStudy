package chapter04.condition;

public class SwitchTest1 {

	public static void main(String[] args) {
		// 스위치케이스 예제1
		int ranking = 2;
		
		switch(ranking) {
			case 1:
				System.out.println("축하!금메달이에요");
				break;
			case 2:
				System.out.println("은메달입니다");
				break;
			case 3:
				System.out.println("동메달이에요");
				break;
			default:
				System.out.println("참가상");
				break;
		}
	}

}
