package chapter06.array;

public class TwoDimensionTest3 {

	public static void main(String[] args) {
		// 불규칙 배열
		int[][] score= {
				{77,56,70,82,95,96,98,82},
				{99,96},
				{81,69,62,80,77}
		};
		for(int st=0;st<score.length;st++) {
			System.out.print((st+1)+"번 학생 성적: ");
			for(int sj=0;sj<score[st].length;sj++) {
				System.out.print(score[st][sj]+" ");
			}System.out.println();
		}

	}

}
