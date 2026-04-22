package jp.co.aforce.sample;

public class five {
	public static void main(String[] args) {
//		5
		double num =7.8;
		int seisu =(int)num;
		double syousu = num - seisu;
		
		System.out.println("整数部分：" + seisu);
		System.out.println("小数部分：" + syousu);
		
//		System.out.printf("小数部分：%.1f%n", syousu);
	}

}
