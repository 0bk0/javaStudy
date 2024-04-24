package chapter05.loop;

public class BreakTest {

	public static void main(String[] args) {
		// break
		// break를 만나는 시점에 해당 반복문을 중단
		for(int i=1;i<=10;i++) {
			if(i==7)break;
			System.out.println("반복회차: "+i);
		}
		
		// exit label
		loop:
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==3&&j==3)
					break loop;
				System.out.print("0 ");
		}
			System.out.println();
		}

	}

}
