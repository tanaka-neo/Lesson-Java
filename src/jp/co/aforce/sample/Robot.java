package jp.co.aforce.sample;

public class Robot {
	String name;

	Robot(String name) {
		this.name = name;
	}

	void move() {
		System.out.println(name + "は前に進んだ。");
	}

	public static void main(String[] args) {
		Robot r1 = new Robot("Aロボ");
		Robot r2 = new Robot("Bロボ");
		Robot r3 = new Robot("Cロボ");

		r1.move();
		r2.move();
		r3.move();
	}
}
