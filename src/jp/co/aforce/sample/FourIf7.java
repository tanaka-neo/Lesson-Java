package jp.co.aforce.sample;

import java.util.Scanner;

public class FourIf7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("年齢を入力してください。");
		int judge = sc.nextInt();

		if (judge >= 60) {
			System.out.println("入場料は500円です。");
		} else if (judge >= 13) {
			System.out.println("入場料は1000円です。");
		} else {
			System.out.println("入場料は無料です。");
		}
		sc.close();

	}

}

//問5 C
