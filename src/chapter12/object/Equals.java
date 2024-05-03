package chapter12.object;

public class Equals {	//컬렉션(자료구조 타입)에 담아두고 저장된 데이터들을 비교할때 주로 사용됨(중복있는지 라던가)

	public static void main(String[] args) {
		User ua = new User(100,"이상웡");
		User ub = ua; 	//주소값 동일하게 받음
		User uc = new User(100,"이상웡");	//새로운 힙영역에 들어갔지만 이름과 아이디는 같음
		
		System.out.println("------ua VS ub------");
		if(ua==ub)	//동일성 비교
			System.out.println("1.a와 b의 주소는 같다.");
		else
			System.out.println("2.a와 b의 주소는 다르다.");
		
		if(ua.equals(ub))	//동등성 비교
			System.out.println("3.a와 b의 주소는 같다.");
		else
			System.out.println("4.a와 b의 주소는 같지 않다.");
		
		//컨트롤 c 컨트롤 v 하고 컨트롤 f 하면 변수 바꾸는 단축키
		System.out.println("------ua VS uc------");
		if(ua==uc)	//동일성 비교
			System.out.println("1.a와 c의 주소는 같다.");
		else
			System.out.println("2.a와 c의 주소는 다르다.");
		
		if(ua.equals(uc))	//동등성 비교
			System.out.println("3.a와 c의 주소는 같다.");
		else
			System.out.println("4.a와 c의 주소는 같지 않다.");
		


		
		
	}

}
