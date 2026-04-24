package jp.co.aforce.sample;

import java.util.Scanner;

public class ThreeDoWhi7 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		
		do {
			sum += num;
			num = sc.nextInt();
		} while (num != 0);
		
		System.out.println(sum);
		sc.close();
	}
}
