package jp.co.aforce.sample;

public class FiveKakuFor7 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		// ここに拡張for文を追加して、配列の要素の合計を計算してください

		for (int num : numbers) {
			sum += num;
		}
		System.out.println("合計: " + sum);
	}
}
