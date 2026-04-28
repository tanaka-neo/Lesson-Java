package jp.co.aforce.sample;

public class MainArrayUtils {
	public static void main(String[] args) {
		int[] numbers = { 3, 8, 1, 5, 9 };
		int result = ArrayUtils.max(numbers);
		System.out.println("最大値：" + result);
	}
}
