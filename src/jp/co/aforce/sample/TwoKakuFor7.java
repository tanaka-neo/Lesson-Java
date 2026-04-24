package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class TwoKakuFor7 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();

		fruits.add("apple");
		fruits.add("strawberry");
		fruits.add("pear");
		fruits.add("grape");
		fruits.add("cherry");
		
		for (String manyFruits : fruits) {
			System.out.println(manyFruits);
		}
	}

}
