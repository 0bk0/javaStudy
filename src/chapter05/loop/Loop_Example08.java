package chapter05.loop;

public class Loop_Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1번
  *     *
  *    ***
  *   *****
  *  *******
  * *********
  * 2번
  * *********
  *  *******
  *   *****
  *	   ***
  *     *
 */
		//1번풀이(사진있음)
		System.out.println("1번");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<1+2*i;k++) {
				System.out.print("*");
			}	for(int l=0;l<4-i;l++) {
				System.out.print(" ");
			}System.out.println();		
			}
		//2번
		System.out.println("2번");
		for (int i=5;i>=1;i--) { //5줄에서 점점 줄어듬
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}}}
		
		


