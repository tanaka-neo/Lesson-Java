package jp.co.aforce.sample;

import java.util.Scanner;

public class TwoIf7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int judge = sc.nextInt();
		
		if(judge >= 0) {
			System.out.println("正の数");
		} else {
			System.out.println("負の数");
			
		}
		sc.close();
	}

}
