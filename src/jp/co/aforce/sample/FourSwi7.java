package jp.co.aforce.sample;

import java.util.Scanner;

public class FourSwi7 {
	public static void main(String[] args) {

		System.out.println("月の番号を入力してください");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String message;

		switch (num) {
		case 1:
			message = "1月";
			break;

		case 2:
			message = "2月";
			break;

		case 3:
			message = "3月";
			break;

		case 4:
			message = "4月";
			break;

		case 5:
			message = "5月";
			break;

		case 6:
			message = "6月";
			break;

		case 7:
			message = "7月";
			break;

		case 8:
			message = "8月";
			break;

		case 9:
			message = "9月";
			break;

		case 10:
			message = "10月";
			break;

		case 11:
			message = "11月";
			break;

		case 12:
			message = "12月";
			break;

		default:
			message = "1～12を入力してください";

		}
		System.out.println(message);
		sc.close();
	}
}
