package chapter17.innerclass;

class AA {
	int i = 100;
	BB b = new BB();

/*
	BB클래스를 AA클래스 안에서만 사용하려고 하면 안에다가 생성
	AA의 멤버에 접근이 용이해짐
	AA에서만 사용될거면 불필요한 부분이 밖으로 드러나지 않으므로 "캡슐화"
*/
	class BB { // AA의 인스턴스 내부 클래스
		void method() {
			i += 100;

			AA a = new AA();
			System.out.println("-----");
			System.out.println(a.i);
			System.out.println(i);
		}
	}

	// 더 이전의 만들어진 클래스라 얘는 가능함
	static class CC { // AA의 정적 내부 클래스=CC
		void method() {

		}
	}
}

public class InnerClass_Test1 {

	public static void main(String[] args) {
		AA a = new AA(); //하나의 인스턴스인 a에서 값을 불러오고 누적시키기때문에 아래의 3개는 값이 증가됨
		a.b.method();

		AA.BB b = a.b; // AA.BB → AA의 소속의 BB라는 타입(AA내부에 있는 BB라는 클래스 타입)
		b.method();

		AA.BB c = a.new BB(); // a 인스턴스 생성후 BB라는 클래스 호출?
		c.method();

		AA.BB d = new AA().b; //새로운 AA이기 때문에 값은 다시 100부터 초기화 시작
		d.method();

		AA.BB e = new AA().new BB();
		e.method();

		// AA의 안쪽에 들어가 있어서 AA를 먼저 안꺼내두면 단일적으로는 찾을 수 없음(없는 클래스)
		// ↓BB err1 = new BB();
		// 소속을 밝혀줬지만 AA라는 클래스의 인스턴스 생성 전까지는 BB라는 인스턴스 만들 수가 없음
		// ↓AA.BB err2 = new AA.BB();

		AA.CC f = new AA.CC(); // a가 생성되지 않아도 CC가 스텝틱이라 만들 수 있음
		f.method();

	}

}
