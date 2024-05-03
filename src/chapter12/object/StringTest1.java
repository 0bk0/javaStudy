package chapter12.object;

public class StringTest1 {

	public static void main(String[] args) {
		// 출력함수 - print() println() printf() String.format()
		/*
		 * 1. 탈출문자 
		 * \n 	\t 	\" 	\' 
		 * 2. printf 출력서식 
		 * %b 	%d 	%f 	%c 	%s 	%o 	%x 
		 * 플래그 
		 * "-" 	"+" 	"0" 	"," 	"#"
		 */
		int number = 10;
		double score = 12.345;
		String text = Integer.toBinaryString(number);
		
		//printf(출력하고싶은 문자열, 지시자에 들어가는 값 1, 2, ...)
		System.out.printf("%b %n", 3 < 1); //boolean
		System.out.printf("%d %n", number); //10진수
		System.out.printf("%o %n", number); //8진수
		System.out.printf("%x %n", number); //16진수
		System.out.printf("%,d %n", 1000000); //3자리마다 , 표시
		System.out.printf("%+d %n", 10); //부호표시
		System.out.printf("%+d %n", -10); //부호표시
		
		System.out.printf("%f 	%n", score); //부동소수점
		System.out.printf("%e 	%n", score); //지수

		System.out.printf("%c 	%n", 65); //문자-유니코드 아스키코드
		System.out.printf("%s 	%n", "안냐세요"); //문자열
		System.out.printf("%s 	%n", text); //문자열
		
		System.out.printf("[%10d] %n", number); //전체 10자리(우측 정렬)
		System.out.printf("[%-10d] %n", number); //전체 10자리(좌측 정렬)
		System.out.printf("[%010d] %n", number); //전체 10자리(빈공간 0)
		System.out.printf("[%10.5f] %n", score); //전체 10자리(소수점 5자리)
		
		String str = String.format("이름: %s, 나이: %d"
				, "홍길동", 20);
		System.out.println(str);


	}

}
