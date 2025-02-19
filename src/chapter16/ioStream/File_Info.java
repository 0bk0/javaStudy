package chapter16.ioStream;

import java.io.File;

public class File_Info {

	public static void main(String[] args) {
		File f = new File("C:\\scit_workspace\\fileTest.txt");
		if (f.exists()) { // 파일 존재 여부
			if (f.isFile()) { // 경로가 파일인지 검사
				System.out.println("파일입니다.");
				System.out.println("파일 경로: " + f.getParent());
				System.out.println("파일 이름: " + f.getName());
				System.out.println("파일 크기: " + f.length());
				System.out.println("숨김 파일: " + f.isHidden());
				System.out.println("절대 경로: " + f.isAbsolute());
			} else if (f.isDirectory()) { // 경로가 디렉터리인지 검사
				System.out.println("디렉터리입니다.");
			}

		} else {
			System.out.println("파일이 없습니다.");
		}

	}

}
