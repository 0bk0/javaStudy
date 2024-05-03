package chapter13.generic;

class coffee {
}

class juice {
}

class Beveragebox {
	private Object[] beberage; // Object는 가장 최상위 부모뭐시기

	public Beveragebox(Object[] bbeberage) {
		this.beberage = beberage;
	}

	public Object getBeberage(int index) {
		return beberage[index];
	}

}

public class Generic_test1 {

	public static void main(String[] args) {
		coffee[] arr = { // 인스턴스 2개 생성, 커피라는 애들만 들어감?
				new coffee(), new coffee() };
		Beveragebox box = new Beveragebox(arr);
		coffee Coffee = (coffee) box.getBeberage(0);
		// juice Jucie = (juice) box.getBeberage(1);
		// 애초에 커피배열이지만 오브젝트가 최상위 뭐시기라서
		// 다운캐스팅으로 주스를 넣을 수는 있는데 컴파일시점에서 오류남

		// 제네릭타입 사용
		Beveragebox2<coffee> box2 = new Beveragebox2<>(arr); // 뒤는 <> 이렇게 생략가능
		// 에러는 안나는데 노란줄표시(해당변수가 사용되지않음) / 제대로 타입 명시 안해줘서 그렇다나봄
		coffee Coffee2 = box2.getBeberage(0);
		// juice Jucie = box2.getBeberage(1);
		// ↓컴파일러 체크 후 에러발생
	}

}

class Beveragebox2<T> { // 제네릭 타입은 꺽쇠표시 안에 부를 이름을 적어야함(but, 정해지지않는 타입)
	// 외부로부터 받아오는 제네릭타입을 사용하겠다
	// 인스턴스를 생성하는 시점에서만 받아올 수 있음(스텝틱에서는 더 앞선 영역이기에 받아오기 어려움)
	private T[] beberage;
	// static T t; / 사용불가

	public Beveragebox2(T[] bbeberage) {
		this.beberage = beberage;
		// T t = new T();
		// T타입으로는 인스턴스 생성 불가(아직 정해지지않아서? 몰라;)
	}

	public T getBeberage(int index) {
		return beberage[index];
	}

}
