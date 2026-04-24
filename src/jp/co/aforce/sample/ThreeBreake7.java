package jp.co.aforce.sample;

public class ThreeBreake7 {
	public static void main(String[] args) {

		int[][] numbers = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		boolean found = false;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				if (numbers[i][j] == 5) {
					System.out.println("見つけた：" + numbers[i][j]);
					found = true;
					break; // 内側ループ終了
				}
			}

			if (found) {
				break; // 外側ループ終了
			}
		}
	}
}

//あまり理解できていない。
