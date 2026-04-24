package jp.co.aforce.sample;

public class ThreeKakuFor7 {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		System.out.println(sum);
	}

}
