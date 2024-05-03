package chapter12.object;

import java.util.Iterator;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// Math의 random()
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println((int) (Math.random() * 10) + 1);
		}
		System.out.println("---------------------");

		// Random
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(10));
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(getRandom(5, 10));

		}

	}

	static int getRandom(int a, int b) {
		return (int) (Math.random() * (b - a)) + a;
	}

}
