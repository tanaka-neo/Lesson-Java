package jp.co.aforce.sample;

import java.util.Scanner;

public class FiveSwi7 {
	public static void main(String[] args) {
		System.out.println("成績を入力してください");
		Scanner sc = new Scanner(System.in);

		String grade = sc.next();

		String message;

		switch (grade) {
		case "A":
			message = "順調です。";
			break;
			
		case "B":
			message = "もう少しです。";
			break;
			
		case "C":
			message = "まあまあです。";
			break;
			
		case "D":
			message = "危ないです。";
			break;
			
		case "F":
			message = "もう少し頑張りましょう。";
			break;
		
	    default:
	    message ="A～Fを入力してください。";
	}
		System.out.println(message);
		sc.close();
}
}
