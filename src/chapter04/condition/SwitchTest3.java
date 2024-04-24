package chapter04.condition;

public class SwitchTest3 {

	public static void main(String[] args) {
		String country = "china";
		switch(country.toLowerCase()) {
		case "korea":
			System.out.println("seoul");
			break;
		case "china":
			System.out.println("beijing");
			break;
		case "japan":
			System.out.println("tohyo");
			break;
		}
		// 주소값을 비교하려면 == 내용물을 비교하려면 .equals();를 사용함
		String a =new String("안냥");
		String b =new String("안냥");
		String c = "안냥";
		String d = "안냥";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		// 	문자열 상수풀안에 동일한 값을 씀↓
		System.out.println(c==d);
		System.out.println(c.equals(d));


	}

}
