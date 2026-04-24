package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class SixKakuFor7 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		// ここに拡張for文を追加して、リストの要素を出力してください

		for (String name : names) {
			System.out.println(name);
		}
	}
}
