package chapter11.interface_part;

class HandPhone{
	void call() {
		System.out.println("전화걸기");
	}
	void receive() {
		System.out.println("전화받기");
	}
}
interface Camere{
	void takepicture();
}
class HandPhoneCamere extends HandPhone implements Camere{
	@Override
	public void takepicture() {
		System.out.println("하나둘셋 김~~치");
	}
}

public class Multi_Inheritance {

	public static void main(String[] args) {
		HandPhoneCamere myPhone = new HandPhoneCamere();
		myPhone.call();
		myPhone.receive();
		myPhone.takepicture();
	}

}
interface A{}
interface B{}
interface C extends A, B{} //인터페이스끼리는 다중상속 가능함
//class g extends A, B{} 는 에러발생

class D{}
class E extends D implements A, B{} //다중구현 가능함

