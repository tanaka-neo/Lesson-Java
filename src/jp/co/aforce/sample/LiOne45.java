package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LiOne45 {
	public static void main(String[] args) {
List<Integer>Numbers = new ArrayList<>();
		
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		
		System.out.println("元のリスト：" + Numbers);
		Set<Integer> set = new HashSet<>(Numbers);

        System.out.println("重複削除後：" + set);
		
	}

}
