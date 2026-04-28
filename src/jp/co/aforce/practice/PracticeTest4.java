package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTest4 {
	public static void main(String[] args) {
	
		List<String>animals = new ArrayList<>();
		
		animals.add ("犬");
		animals.add ("猫");
		animals.add ("うさぎ");
		animals.add ("へび");
		
		String animal="猫";
		
		if (animals.contains(animal)) {
			System.out.println(animal+"はリストに含まれています。");		
		} else {
			System.out.println(animal+"はリストに含まれていません。");		
		}
		
		
		Calendar tuki = Calendar.getInstance();
		int month = tuki.get(Calendar.MONTH) + 1;
		
		switch(month) {
		case 1:
			System.out.println("冬物セール");
			break;

		case 2:
			
		case 3:

		case 4:
			System.out.println("春物を売る");
			break;

		case 5:
			System.out.println("春物セール");
			break;

		case 6:
		
		case 7:
			System.out.println("夏物を売る");
			break;

		case 8:
			System.out.println("夏物セール");
			break;

		case 9:
			System.out.println("秋物を売る");
			break;

		case 10:
		
		case 11:
			
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("1～12を入力してください");
			break;
		}

	}
}		
//		途中です。


