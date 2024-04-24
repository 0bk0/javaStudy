package chapter05.loop;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filesize = 720;
		int download = 0;
		while(download<filesize) {
			download+=120;
			System.out.println(download+"k 다운로드 중...");
		
		}
		System.out.println("다운로드 완료");
	}

}
