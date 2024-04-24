package chapter08.classPart;

class Member{ //public에서 private로 바꿈 //멤버어쩌구변수는 이 안에서밖에 사용할수밖에 없는데
	private String id;
	private String password;
	private String phoneNumber;
	//명시적 생성자 생성하고 초기화하는 과정임↓
	public Member(String id, String password, String phoneNumber) {
		this.id=id;
		this.password=password;
		this.phoneNumber=phoneNumber;
	}
	//getter / setter 라는 멤버메서드를 사용하여 내부데이터에 제한적 접근을 허용
	public String getId() { //불러오기(읽기전용)
		return this.id;
		
	}
	public void setPassword(String password) { //수정하기(but,볼순없음)
		this.password=password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//회원정보 확인용 메서드
	public void memberInfo(String pwCheck) {
		if(this.password.equals(pwCheck)) {
			System.out.println("[회원정보]");
			System.out.println("*ID: "+this.id);
			System.out.println("*PW: "+this.password);
			System.out.println("*Phone: "+this.phoneNumber);

		}
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		/*
		 * 접근지정자, 접근제어자
		 * - 클래스 내부의 변수나 메서드, 생성자에 대한 접근권한을 가짐
		 * - public: 외부 클래스 어디에서나 접근
		 * - protected: 같은 패키지 내부와 상속 관계(부모-자식)의 클래스에서만 접근
		 * - (default): 같은 패키지 내부에서만 접근=아무값도 쓰지않았을때
		 * - private : 같은 클래스 내부에서만 접근
		 */

		Member member1 = new Member("홍길동","1234","01012345678");
		String id = member1.getId();
		System.out.println(id);
		member1.setPassword("5678"); //패스워드 저장~
		member1.memberInfo("5678"); //동일한 패스워드 입력하면 회원정보 출력해줌
		
		
		
		/*	member1.id="이순신"; //private로 막아놨기때문에 접근불가능하단 의미
		member1.password="23434324";
		System.out.println(member1.id);
		System.out.println(member1.password); */
	}

}
