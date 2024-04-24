package chapter05.loop;

public class NestLoop1 {

	public static void main(String[] args) {
		// 중첩 반복문
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			//System.out.println();
			System.out.println();	
		}
		System.out.println("--------------");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(j+"*"+i+"="+i*j+'\t');
			}
			System.out.println();
		}

	}

}
