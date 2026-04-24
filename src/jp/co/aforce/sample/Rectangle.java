package jp.co.aforce.sample;

public class Rectangle {
	int width;
	int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	void showArea() {
		int area = width * height;
		System.out.println("面積："+area);
	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 11);
		r.showArea();
	}
}
