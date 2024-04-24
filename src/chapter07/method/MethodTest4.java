package chapter07.method;

public class MethodTest4 {

	public static void main(String[] args) {
		// 파라미터/반환타입 공부해야함 뭔지 1도 모름
		int num=2;
		int b=getDouble(num);
		System.out.println("num="+num);
		
		int[] arr= {2,8,6};
		getDouble(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(
					"arr["+i+"]="+arr[i]);
		}

		
	}
		static int getDouble(int value) {
			value*=2;
				return value;
}
		static void getDouble(int[] value) {
			value[0]*=2;
}

	}
