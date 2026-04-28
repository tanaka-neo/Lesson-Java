package jp.co.aforce.sample;

public class Car2 {
	String name;
	int speed;

	public Car2() {
		this.name = "未設定";
		this.speed = 0;
	}
	 public Car2(String name, int speed) {
	        this.name = name;
	        this.speed = speed;
		}

		public void show() {
		System.out.println("車名" + name);
		System.out.println("速度" + speed);

	}

	public static void main(String[]args) {
		Car2 c1 = new Car2();
		c1.show();
		Car2 c2 = new Car2("ベンツ",120);
		c2.show();
		
		}
}