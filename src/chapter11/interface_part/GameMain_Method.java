package chapter11.interface_part;
/*		   1. 프로그램이 실행되면 메뉴를 출력한다.
		 * 2. 메뉴는 (1.캐릭터 생성, 2.캐릭터 정보, 3.전직하기, 4.공격하기, 0.종료)
		 *    - (1.캐릭터 생성)을 선택한 경우, 이름과 스탯값을 초기값으로 하는 Novice(평민)클래스형 인스턴스를 생성한다.
		 *      스탯은 (힘, 민첩, 지능)이 있으며 각각 랜덤한 값을 가지고, 
		 *      형평성을 위해 스탯의 총 합이 15이상인 경우에만 저장되도록 하며,
		 *      사용자의 선택에 따라 해당 스탯을 저장 or 스탯 재부여 할 수 있도록 한다.
		 * 3. - (2.캐릭터 정보)를 선택한 경우, 생성된 캐릭터의 이름, 직업, 힘, 민첩, 지능을 출력한다.
		 * 4. - (3.전직하기)를 선택한 경우, 생성된 캐릭터의 정보를 초기값으로 가지는 
		 *      선택한 클래스에 해당하는 인스턴스를 생성하고 문구를 출력한다.
		 * 5. - (4.공격하기)를 선택한 경우, Attack()메서드를 호출하여 직업(인스턴스)에 따라 공격한다.
		 * 6. - (5.스킬사용)을 선택한 경우, Skill()메서드를 호출하여 직업(인스턴스)에 따라 스킬을 사용한다.
		 * 7. - (0.종료)를 선택한 경우, 프로그램을 종료한다.
		 * 8. - 종료를 선택하기 전까지 반복한다.
 */

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {
	// 사용자에게 보여지는 출력문을 실행하는 메서드를 실행
	Scanner scan = new Scanner(System.in);

	public void rpgMenu() {
		System.out.print("""
				=====  RPG  =====
				1. 캐릭터 생성
				2. 캐릭터 정보
				3. 전직하기
				4. 기본 공격
				5. 스킬 사용
				0. 종료
				=================
				번호를 선택하세요 : """);
	}

	public Novice CMake() {
		Random r = new Random();
		System.out.print("""
				캐릭터를 생성합니다.
				아이디를 입력해주세요 : """);
		String CName = scan.next();
		int str = 0;
		int dex = 0;
		int intel = 0;
		while (true) {
			str = r.nextInt(7);
			dex = r.nextInt(7);
			intel = r.nextInt(7);
			if (str + dex + intel <= 15) {
				continue;
			}
			System.out.println("""
					스탯을 부여합니다.
					부여된 스탯정보 : 힘[""" + str + "], 민첩[" + dex + "], 지능[" + intel + "]");
			System.out.print("스탯을 다시 받으시겠습니까?(Y/N) : ");
			String yorn = scan.next();
			if (yorn.equals("y") || yorn.equals("Y")) {
				continue;
			} else if (yorn.equals("n") || yorn.equals("N")) {
				break;
			}

		}
		System.out.printf("[ID: %s, stat: 힘(%d), 민첩(%d), 지능(%d)]",CName,str,dex,intel);
		System.out.println("\n현재 정보로 저장합니다.");
		Novice ch = new Novice(CName, str, dex, intel);
		return ch;
		
		
		
		
	}
public class CInfo{
	

}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

}
