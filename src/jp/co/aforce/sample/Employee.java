package jp.co.aforce.sample;

public class Employee {
	String id;
	String name;
	int salary1;
	int salary;

	void raiseSalary(int percent) {

		salary1 = salary + (salary * percent / 100);

		System.out.println("昇給後の給与" + salary1);
	}

	public static void main(String[] args) {

		Employee e = new Employee();

		e.name = "Taro";
		e.salary = 300000;

		e.raiseSalary(10);
	}
}
