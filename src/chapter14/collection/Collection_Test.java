package chapter14.collection;

import java.util.Scanner;

class User {
	int id;
	int pw;
	String name;
	int reg_date;

	public User(String name, int id, int pw, int reg_date) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.reg_date = reg_date;
	}
}

public class Collection_Test {
	// User_Info_method
	Scanner sc = new Scanner(System.in);
	
		public void PrintMenu() {
			System.out.print("""
					*** User 정보 확인 프로그램 ***
						1. 회원 가입
						2. 회원 조회
						3. 전체 조회
						0. 종	료
					> 번호를 입력하세요:  """);
			int n = sc.nextInt();
			while(true) {
				System.out.println("> 조회할 ID: ");
				String s = sc.next();
				if(s != null)
					continue;
				else
					System.out.println("> 회원 정보가 없습니다.");
					break;
				

			}
		}
		
	}


