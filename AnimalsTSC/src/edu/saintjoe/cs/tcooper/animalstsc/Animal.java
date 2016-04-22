package edu.saintjoe.cs.tcooper.animalstsc;

public class Animal {
	
	String picture;
	String location;
	int weight;
	String foodType;
	int age;
	
	/*---------------------*/
	public Animal() {
		//this is a constructor
		//even though we didn't write this before it was always here by default
		this.location = "nowhere";
		this.picture = "no picture";
	}
	
	public Animal (String startingLocation) {
		this.location = startingLocation;
	}
	
	public Animal (int startingWeight){
		this.weight = startingWeight;
	}
	
	public Animal (String foodType, int age){
		this.foodType = foodType;
		this.age = age;
	}
	public Animal (String startLocation, String startPicture, int startWeight){
		this.weight = startWeight;
		this.location = startLocation;
		this.picture = startPicture;
	}
	
	
	public String makeNoise(){
		return("Ommmmmmmmmmmmmmmm");
	}
	
	public void eat(){
		System.out.println("Animal is eating");
	}
}