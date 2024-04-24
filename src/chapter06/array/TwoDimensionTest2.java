package chapter06.array;

public class TwoDimensionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= { //score.length = 3줄 / score[0].length = 12개
				{77, // score[0][0]
					56,70,82}, //score[0]
				{99,96,89,88}, //score[1]
				{81,69,62,80}}; //score[2]
		//student=st subject=sj
		int classSum=0;
		for(int st=0;st<score.length;st++) {
			int sum=0;
			for(int sj=0;sj<score[0].length;sj++) {
				sum+=score[st][sj];
			}
			System.out.println((st+1)+"번 총점: "+sum+", "+"평균: "+(float)sum/score[0].length);
			classSum+=sum;}
		System.out.println("학급 전체 평균: "+(float)classSum/(score.length*score[0].length));

	}

}
