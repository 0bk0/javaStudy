package chapter12.object;

record Member(String name, int memberCode) {}
/*
	record
	불변(imutable) 객체를 쉽게 생성할 수 있도록 하는 유형의 클래스
	- 모든 필드에 final 선언
	- 팔드 값을 모두 포함한 생성자 생성
	- 접근자 메서드(getter) 생성
	
	!자동생성
	- 생성자 메서드
	- getter 메서드
	- equals 메서드
	- hashcode 메서드
	- toString 메서드
	
	!장점
	- 레코드 클래스를 사용하면 훨씬 간결한 방식으로 동일한 블변 데이터 객체를 정의할 수 있음
	- 컴파일러가 헤더를 통해 내부 필드를 추론하며 생성자 및 toString,
	equals, hashcode 메서드에 대한 구현을 자동으로 제공
	!단점
	- 레코드는 암묵적으로 final 클래스 (상속불가)이며, abstract 선언 불가
	다른 클래스를 상속(extends) 받을 수 없음
 */

public class RecordTest {

	public static void main(String[] args) {
		Member member = new Member("홍길동", 1234);
		System.out.println(member);
		System.out.println(member.name());
		System.out.println(member.memberCode());

	}

}
