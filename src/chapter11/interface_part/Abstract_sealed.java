package chapter11.interface_part;

abstract sealed class Languege permits Java, Cpp, Csharp {
}

final class Java extends Languege {
}
//final class Cpp extends Languege{}
//final class Csharp extends Languege{}
//final class Python extends Languege{} //에러발생

//Java 클래스는 final이라서 상속 불가능
//final class OpenJava extends Java{} //에러 발생

sealed class Cpp extends Languege permits C11, C20 {
}

non-sealed class Csharp extends Languege {
}

// Cpp로부터는 두개의 클래스 파생 가능
final class C11 extends Cpp {
}

final class C20 extends Cpp {
}
//final class C30 extends Cpp{} //에러 발생

//Csharp로부터는 임의의 클래스 파생 가능
final class CsharpCore extends Csharp {
}

public class Abstract_sealed {

	public static void main(String[] args) {
		/* 상속 제한 
		 * final: 더이상 파생할 수 없음 
		 * sealed: 지정한 후손에 대해서만 파생을 허가함 
		 * non-sealed: 제한 없이 파생시킬 수 있음
		 */
		Languege lang_java = new Java();
		outLanguegeName(lang_java);
	}

	public static void outLanguegeName(Languege lang) {
		if (lang instanceof Java) {
			System.out.println("자바");
		} else if (lang instanceof Cpp) {
			System.out.println("C++");
		} else if (lang instanceof Csharp) {
			System.out.println("C#");
		}
	}

}
