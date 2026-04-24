package jp.co.aforce.sample;

public class Student2 {
	String name;
	int grade;

	Student2(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	void showTest() {
		System.out.println("名前：" + name + "点数：" + grade);
	}

	public static void main(String[] args) {
		Student2 s = new Student2("taro", 88);
		s.showTest();
	}
}
