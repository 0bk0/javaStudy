package chapter13.generic;

class Point<T, V> {
	T x;
	V y;

	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}

public class Generic_Method {

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);// 생락안한 버전
		Point<Integer, Double> p2 = new Point<>(10, 10.0);// 생략한 버전

		double rect = Generic_Method.makeRectangle(p1, p2);
		System.out.printf("두 점으로 만들어진 사각형의 넓이는 %f", rect);

	}

	// 제네릭 메서드
	static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;
		return width * height;
	}

}
