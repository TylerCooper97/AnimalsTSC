package edu.saintjoe.cs.tcooper.animalstsc;

public class AnimalTester {

	public static void main(String[] args) {
	Animal myPet = new Animal();//this instantiation calls the default constructor
	Animal myLocalPet = new Animal("Here");//this one uses the one parameter constructor
	Animal Billy = new Animal(20);
	Animal Alfred = new Animal("My house", "Dog", 25);
	Animal Jimmy = new Animal("Beef", 15);
	
	System.out.println("myPet has " + myPet.location + " as its location");
	System.out.println("myLocalPet has " + myLocalPet.location + " as its location");
	System.out.println("Billy has " + Billy.weight + " as its weight");
	System.out.println("Alfred has " + Alfred.weight + " as its weight");
	System.out.println("Alfred has " + Alfred.location + " as its location");
	System.out.println("Alfred has " + Alfred.picture + " as its picture");
	System.out.println("Jimmy has " + Jimmy.foodType + " as its food type");
	System.out.println("Jimmy has " + Jimmy.age + " as its age");

	}

}
