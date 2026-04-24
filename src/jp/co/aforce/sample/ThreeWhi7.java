package jp.co.aforce.sample;

import java.util.Scanner;

public class ThreeWhi7 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		while (num != 0) {
			sum += num;
			num = sc.nextInt();
		}
		System.out.println(sum);
		sc.close();
	}
}
