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
		
//		解答
//		class Person {					
//		    private String name;				
//		    private int age;					
//							
//		    // コンストラクタ					
//		    public Person(String name, int age) {					
//		        this.name = name;					
//		        this.age = age;					
//		    }					
//							
//		    // nameのゲッターとセッター					
//		    public String getName() {					
//		        return name;					
//		    }					
//							
//		    public void setName(String name) {					
//		        this.name = name;					
//		    }					
//							
//		    // ageのゲッターとセッター					
//		    public int getAge() {					
//		        return age;					
//		    }					
//							
//		    public void setAge(int age) {					
//		        if (age >= 0) {  // 年齢が負にならないようにする					
//		            this.age = age;					
//		        }					
//		    }					
//		}					

		
		
		
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
		
		
//解答		
//		java+GB33:G67				
//		コピーする編集する				
//		// 親クラス（Animal）				
//		class Animal {				
//		    void makeSound() {				
//		        System.out.println("Some sound...");				
//		    }				
//		}				
//						
//		// 子クラス（Dog） - makeSoundをオーバーライド				
//		class Dog extends Animal {				
//		    @Override				
//		    void makeSound() {				
//		        System.out.println("Woof! Woof!");				
//		    }				
//		}				
//						
//		// 子クラス（Cat） - makeSoundをオーバーライド				
//		class Cat extends Animal {				
//		    @Override				
//		    void makeSound() {				
//		        System.out.println("Meow! Meow!");				
//		    }				
//		}				
//						
//		// メインクラス				
//		public class Main {				
//		    public static void main(String[] args) {				
//		        Animal myDog = new Dog();				
//		        Animal myCat = new Cat();				
//						
//		        myDog.makeSound(); // "Woof! Woof!"				
//		        myCat.makeSound(); // "Meow! Meow!"				
//		    }				
//		}				
//

	}
}
