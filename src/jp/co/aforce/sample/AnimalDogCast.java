package jp.co.aforce.sample;

public class AnimalDogCast {
	public static void main(String[] args) {
		
		AnimalCast animal = new DogCast();
		
		DogCast dog = (DogCast)animal;
		
		dog.bark();
	}
}
