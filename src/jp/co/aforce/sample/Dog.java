package jp.co.aforce.sample;

public class Dog {
	String name;

	Dog(String name) {
		this.name = name;
	}

	void showName() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Dog n = new Dog("ポチ");
		n.showName();

	}
}
