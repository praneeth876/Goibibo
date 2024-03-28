package com.Abstraction;

public class Animal {

	//state or properties or variables
	String breed;
	String colour;   
	double weight;
	
	//Behaviours or functions or methods
    public void sleep() {
		System.out.println("sleeping");
	}
	public void bark() {
		System.out.println("eating");
	}
	void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.breed="Germany sheperd";
		dog.colour="brown";
		dog.weight=21.05;
		
		System.out.println("Breed of dog : "+dog.breed);
		System.out.println("Colour of dog : "+dog.colour);
		System.out.println("Weight of dog : "+dog.weight);
		
		dog.sleep();
		dog.bark();
		dog.run();
	}
	
	
	
}
