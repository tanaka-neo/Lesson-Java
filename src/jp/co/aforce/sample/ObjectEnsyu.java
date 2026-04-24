package jp.co.aforce.sample;

public class ObjectEnsyu {
	public static void main(String[] args) {

		class Person {
			String name;
			int age;
		}

		class Student extends Person {
			String studentId;
		}

		class Animal {
			void makeSound() {
				System.out.println("Some sound...");
			}
		}
		
//
//		class Dog extends Animal {
//			@Override
//
//			void makeSound() {
//				System.out.println("ワンワン！");
//			}
//		}
//		class Cat extends Animal {
//			@Override
//
//			void makeSound() {
//				System.out.println("ニャーニャー！");
//			}
//		}
//		Animal a1 = new Dog();
//		Animal a2 = new Cat();
//
//		a1.makeSound();
//		a2.makeSound();
	}
}
