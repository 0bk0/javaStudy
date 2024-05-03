package chapter11.interface_part;

abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동 킴");
	}

	public void turnOff() {
		System.out.println("시동 끔");
	}

	// Template 메서드
	// 하위클래스로 미완성 메소드를 구체화 시키고 그 안에서 실행할 수 있음?
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

class AICar extends Car{
	// car클래스 안에 추상 클래스가 포함되어 있어서 에러남
	// car를 구체화 시키거나 aicar를 추상클래스로 만들거나 해야함

	@Override
	public void drive() {
		System.out.println("자율주행 고고");
		System.out.println("자동 방향전환 고고");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
	}
}

class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전함");
		System.out.println("사람이 핸들 조작함");
	}

	@Override
	public void stop() {
		System.out.println("브레이크 밟아서 멈춤");

	}

}

public class TemplateMethod {

	public static void main(String[] args) {
		System.out.println("나는야 자율주행하는 자동차");
		Car myCar = new AICar();
		myCar.run();

		System.out.println("나는야 사람이 운전하는 자동차");
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
