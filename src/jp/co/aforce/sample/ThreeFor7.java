package jp.co.aforce.sample;

public class ThreeFor7 {
	public static void main(String[] args) {

		int a = 1;
		int b = 1;

		System.out.print(a + " " + b + " ");

		for (int i = 3; i <= 10; i++) {
			int c = a + b;
			System.out.print(c + " ");

			a = b;
			b = c;
		}
	}
}
