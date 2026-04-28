package jp.co.aforce.sample;

public class Person4 {

	String name;
	int age;

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "名前：" + name + "、年齢：" + age;
	}
}
