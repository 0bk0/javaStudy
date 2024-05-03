package chapter12.object;

public class StringTest2 {

	public static void main(String[] args) {
		// length
		String str = "아름다운 우리나라";
		System.out.println("길이는 " + str.length());
		System.out.println("2번쨰 문자는 " + str.charAt(2));
		System.out.println();

		// indexof
		String str2 = "String Search Method of String Class";
		System.out.println("앞쪽 t = " + str2.indexOf('t'));
		System.out.println("뒤쪽 t = " + str2.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str2.indexOf('z'));
		System.out.println("앞쪽 String = " + str2.indexOf("String"));
		System.out.println("뒤쪽 String = " + str2.lastIndexOf("String"));

		// startwith
		String str3 = "girl.jpg";
		System.out.println(str3.startsWith("g"));
		System.out.println(str3.endsWith(".jpg"));
		System.out.println();

		// changeCase
		String str4 = "kim bogyeong";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		// 문자열 자체를 변경하는 것은 아님
		str4.toUpperCase();
		System.out.println(str4);
		// 문자열을 변경하려면 저장해야 함
		str4 = str4.toUpperCase();
		System.out.println(str4);
		System.out.println();

		// trim 공백지우기 기능있음
		String str5 = "		kim bogyeong	";
		System.out.println(str5.trim());
		System.out.println(str5.trim().concat("	SMART"));
		System.out.println();

		// replace
		String str6 = "독도는 일본땅, 대마도는 일본땅";
		System.out.println(str6.replace("일본", "한국"));
		System.out.println(str6.replaceFirst("일본", "한국"));
		System.out.println();

		// substring
		String str7 = "0123456789";
		System.out.println(str7.substring(3, 7));
		System.out.println();

		// split
		String city = "서울,대전,대구,부산 찍고~~";
		String[] token = city.split(",");
		for (String s : token) {
			System.out.println(s);
		}
		System.out.println();

		// join 중간중간 / 집어넣는 기능
		String path = String.join("/", "user", "data", "app", "local");
		System.out.println(path);
	}

}
