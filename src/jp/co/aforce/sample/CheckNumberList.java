package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberList {
	public static void main(String[] args) {

		int number = 4;

		List<String> judge = new ArrayList<String>();

		if (number > 10) {
			judge.add("large");
		} else {
			judge.add("small");
		}
		System.out.println(judge);
	}
}
