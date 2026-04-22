package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Two6 {
	public static void main(String[] args) {
		List<Integer>Numbers = new ArrayList<>();
		
		Numbers.add(1);
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		
		System.out.println(Numbers);
		
		Set<Integer>setNumbers = new HashSet<>(Numbers);
		
		System.out.println(setNumbers);
	}

}
