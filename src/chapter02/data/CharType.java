package chapter02.data;

public class CharType {

	public static void main(String[] args) {
		// 문자형(char)
		char ch = '한';
		char ch2 = '\uD55C';
		System.out.println(ch);
		System.out.println(ch2);
		int i = ch;
		System.out.println(i);
		
		// 탈출문자(escape sequence)
		System.out.println("안\n녕");
		System.out.println("안\t녕");
		System.out.println("안\'녕");
		System.out.println("안\"녕");
		System.out.println("안\\녕");
		
		// 텍스트 블록(text block)
		// 자바15 도입
		String str = """
				동해물과 백두산이 마르고 닳도록
				하느님이 보우하사 우리나라 만세
				무궁화 삼천리 화려강산
				대한사람 대한으로 길이 보전하세
				""";
		System.out.println(str);
	}

}
