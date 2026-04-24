package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;

	void showInfo() {
		System.out.println("タイトル：" + title);
		System.out.println("著者：" + author);
		System.out.println("価格：" + price);
	}

	public static void main(String[] args) {
		Book book = new Book();

		book.title = "進撃";
		book.author = "山田太郎";
		book.price = 1500;

		book.showInfo();

	}
}
