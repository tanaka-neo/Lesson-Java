package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		
		String[] product = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		System.out.println(product[1]);
		
		
		List<String>names = new ArrayList<>();
		
		names.add("山田太郎");
		names.add("鈴木花子");
		names.add("佐藤二郎");
		names.add("山田太郎");
		names.add("高橋三郎");
		
		System.out.println(names.get(2));
		
		
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				

		list1.addAll(list2);
		Collections.sort(list1);
		for(int s : list1) {
			System.out.println(s);
		}
		
		
		ArrayList<Integer> list3 = new ArrayList<>();				
		list3.add(13);				
		list3.add(14);				
		list3.add(17);				
		list3.add(21);				

		
//		問７未回答
	}
}
