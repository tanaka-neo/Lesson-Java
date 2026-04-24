package jp.co.aforce.sample;

import java.util.Scanner;

public class ThreeIf7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1つ目の辺：");
		int a = sc.nextInt();
		
		System.out.print("2つ目の辺：");
		int b = sc.nextInt();
		
		System.out.print("3つ目の辺：");
		int c = sc.nextInt();
		
		if(a + b > c && a + c > b && c + b > a ) {
			System.out.println("有効です。");
		} else {
			System.out.println("有効じゃないです。");
		}
		sc.close();
	}
}
