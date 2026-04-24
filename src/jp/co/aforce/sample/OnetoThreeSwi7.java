package jp.co.aforce.sample;

import java.util.Scanner;

public class OnetoThreeSwi7 {
	public static void main(String[] args) {
		//		7章問１ 答えC
		//		問２ 答えA

		System.out.println("曜日の番号を入力してください");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String message;

		switch (num) {
		case 1:
			message = "日曜日";
			break;

		case 2:
			message = "月曜日";
			break;

		case 3:
			message = "火曜日";
			break;

		case 4:
			message = "水曜日";
			break;

		case 5:
			message = "木曜日";
			break;

		case 6:
			message = "金曜日";
			break;

		case 7:
			message = "土曜日";
			break;

		default:
			message = "1〜7を入力してください";
		}
		System.out.println(message);

		sc.close();
	}

}
