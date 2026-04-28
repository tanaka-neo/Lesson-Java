package jp.co.aforce.sample;

public class CAlculatorMain {
	public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.sum(10, 20);
        int result2 = calc.sum(10, 20, 30);

        System.out.println("2つの和：" + result1);
        System.out.println("3つの和：" + result2);
    }
}
