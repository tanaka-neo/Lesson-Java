package jp.co.aforce.sample;

public class Nineteen {
	public static void main(String[] args) {
		boolean p = false;
		boolean q = true;
		boolean r = !(p || q) && (p && !q);
		System.out.println(r);
	}

}
//false