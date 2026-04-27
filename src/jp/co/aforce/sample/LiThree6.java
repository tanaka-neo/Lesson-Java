package jp.co.aforce.sample;

import java.util.LinkedList;

public class LiThree6 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		// 追加
		list.add("Tokyo");
		list.add("Osaka");
		list.add("Kyoto");
		list.add("Fukuoka");

		// 最初と最後
		String first = list.getFirst();
		String last = list.getLast();

		// 表示
		System.out.println("最初: " + first);
		System.out.println("最後: " + last);
	}
}
