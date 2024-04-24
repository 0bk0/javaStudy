package chapter04.condition;

public class SwitchTest4 {

	public static void main(String[] args) {
		// 스위치 표현식
		int ranking = 1;
		String medal = switch(ranking){
							case 1 ->{
								System.out.println("축하");
								yield "금메달";
							}
							case 2 -> "은메달";
							case 3 -> "동메달";
							default -> "참가상";
						};
		System.out.println(medal+"을 수여함");
	}

}
