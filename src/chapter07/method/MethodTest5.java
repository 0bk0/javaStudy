package chapter07.method;

public class MethodTest5 {

	public static void main(String[] args) {
		// 가변인자(variable arguments)
		System.out.println(getSum(1,2));
		System.out.println(getSum(1,2,3,4));
		System.out.println(getSum(1,2,3,4,5,6,7));


	}
	public static int getSum(int...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}//가급적이면 오버로딩으로 가변인자를 사용하진말자(이유는 모름ㅋ)

}
