package jp.co.aforce.sample;


import java.util.LinkedList;
import java.util.List;

public class LiTwo6 {
	public static void main(String[] args) {
		List<String>moji= new LinkedList<>();
		
		moji.add("りんご");
		moji.add("いちご");
		moji.add("あなご");
		
		System.out.println("最初の要素は"+ moji.getFirst());
		System.out.println("最後の要素は"+ moji.getLast());
		
	}
}
