package jp.co.aforce.sample;

public class Rectangle2 {
int width;
int height;


public Rectangle2(int width,int height) {
	this.width = width;
	this.height = height;
}

public Rectangle2(int width) {
	this(width, width);
}

public void display() {
	System.out.println(width);
	System.out.println(height);
}
}
