package jp.co.aforce.sample;

public class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void show() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}

	public static void main(String[] args) {
		Person p = new Person("Taro", 20);
		p.show();
	}
}
