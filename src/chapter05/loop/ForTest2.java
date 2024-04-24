package chapter05.loop;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0,j=1;i<5;i++,j=j+2) {
			System.out.println("i= "+i+", j= "+j);
		}
		//무한루프
		//for ( ; ; ){} 아예 안적으면 계속 나온다
	}

}
