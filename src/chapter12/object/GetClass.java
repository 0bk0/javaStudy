package chapter12.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상횽");	//Human 클래스의 정보를 가져옴
		//객체의 클래스 정보를 조사하는 Class 객체를 리턴함
		Class cls = kim.getClass(); 
		System.out.println("클래스 이름 = " + cls.getName());
		System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

		System.out.println("필드: ");
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + " ");
		}
		System.out.println("\n메서드: ");
		Method[] method = cls.getDeclaredMethods();
		for (Method m : method) {
			System.out.println(m.getName() + " ");
		}

	}

}
