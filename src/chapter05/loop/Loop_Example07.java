package chapter05.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *    3번
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *    4번
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
		//3-1방법
		System.out.println(" "+"3번");
		for(int a=0;a<5;a++) {
			for(int b=0;b<5-a;b++) {
				System.out.print(" ");
			}for(int c=0;c<=a;c++) {
				System.out.print("*");
			}
			System.out.println();
			
			//3-2방법(사진)
			//4-1방법
		}
		
		
	}
}