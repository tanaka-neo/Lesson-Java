package jp.co.aforce.sample;

public class Circle {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}
	
	void showArea() {
		double area = radius * radius * Math.PI;
		
		System.out.println(area);
	}
	public static void main(String[] args) {
		
		Circle c = new Circle(4);
		c.showArea();
	}
}