package chapter12.object;

public class HashCode {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동",20240001); //주소값만 비교한 것이라 1과2는 다름
		Student st2 = new Student("홍길동",20240001);
		Student st3 = st1;
		Student st4 = new Student("홍길동",20240003);
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println("---------");
		
		System.out.println(st1.equals(st2)); //같은 학번이기에
		System.out.println(st1.equals(st3)); //같은 학생이기에
		System.out.println(st1.equals(st4)); //이름은 같은데 학번은 다르기에
		System.out.println("-------------");
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode()); // 얘만 다름
		System.out.println("-------------");

		//객체 고유 hashcode ↑위쪽 애들은 오브젝트가 가진 해시코드를 오버라이딩으로 뽑아낸 것
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		System.out.println(System.identityHashCode(st3));
		System.out.println(System.identityHashCode(st4));





	}

}
