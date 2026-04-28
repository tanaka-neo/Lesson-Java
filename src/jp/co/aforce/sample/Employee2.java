package jp.co.aforce.sample;

public class Employee2 {
	int id;
	String name;

public Employee2(int id,String name) {
	this.id = id;
	this.name = name;
}

	@Override
	public boolean equals(Object obj) {
		Employee2 other = (Employee2) obj;
		return this.id == other.id;
	}
}
