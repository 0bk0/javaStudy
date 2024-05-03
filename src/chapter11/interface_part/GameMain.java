package chapter11.interface_part;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// 출력문이 없는 코드 흐름만 작성
		GameMain_Method GM = new GameMain_Method();
		
		Novice ch = null;
		Scanner scan = new Scanner(System.in);

		while (true) { 
			GM.rpgMenu(); 
			int n = scan.nextInt();
			switch (n) { 
			case 1: 
				ch = GM.CMake();
				break;
			case 2: 

				break;
			case 3:
				
				break;
			case 4: 

				break;
			case 5: 

				break;
			case 0:
				GM.exit();
				System.exit(0);
	}

		}
	}
}
