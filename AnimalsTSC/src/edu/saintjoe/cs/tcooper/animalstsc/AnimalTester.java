package edu.saintjoe.cs.tcooper.animalstsc;

public class AnimalTester {

	public static void main(String[] args) {
		Dog C = new Dog();
		Dog Taco = new Chihuahua();
		Cat Garfield = new Cat();
		Reptile Hiss = new Snake();
		
		System.out.println(C.makeNoise());
		System.out.println(Taco.makeNoise());
		System.out.println(Garfield.makeNoise());
		System.out.println(Hiss.makeNoise());

	}

}
