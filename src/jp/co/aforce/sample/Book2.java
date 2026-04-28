package jp.co.aforce.sample;

public class Book2 {
	String title;
	String author;
	double price;

	static final double DEFAULT_PRICE = 0.0;

	public Book2(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book2(String title, String author) {

		this(title, author, DEFAULT_PRICE);
	}
}
