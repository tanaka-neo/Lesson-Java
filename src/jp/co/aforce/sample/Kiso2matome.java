package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Kiso2matome {
	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("りんご", 100);
		fruitsMap.put("みかん", 80);
		fruitsMap.put("バナナ", 120);
		fruitsMap.put("いちご", 300);

		String order = "いちご";

		if (fruitsMap.containsKey(order)) {
			System.out.println("値段は" + fruitsMap.get(order) + "円です。");
		} else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}

	}

}
