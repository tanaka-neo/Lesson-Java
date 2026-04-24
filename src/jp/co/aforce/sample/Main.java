package jp.co.aforce.sample;

public class Main {
	public static void main(String[] args) {
		Taiyaki annko = new Taiyaki();
		Taiyaki cream = new Taiyaki();
		
		annko.setFilling("あんこ");
		cream.setFilling("クリーム");
		
		annko.showFilling();
		cream.showFilling();
	}
}
