package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Javakiso2 {
	public static void main(String[] args) {
		List<Integer>NumberList =new ArrayList<Integer>();
		NumberList.add(1);
		NumberList.add(2);
		NumberList.add(3);
		NumberList.add(4);
		System.out.println(NumberList);
		
		Integer element1 = NumberList.get(1);
		System.out.println(element1);
		
		NumberList.add(5);
		NumberList.add(6);
		
		NumberList.remove(2);
		NumberList.add(1,3);
		NumberList.remove(3);
		System.out.println(NumberList);
		
//		NumberList.remove(2);
//		NumberList.add(2,4);でもいいけど
		NumberList.set(2,4);
		System.out.println(NumberList);
		
		NumberList.clear();
		System.out.println(NumberList);
		
		
	}
}
