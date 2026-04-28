package jp.co.aforce.sample;

public class Person3 {

	String name;
	int age;

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}

	public static void main(String[] args) {

		Person3 p = new Person3("田中", 20);

		p.show();
	}
}
