package chandu;

public class Animal {
	// Superclass (Parent Class)
	
	    String name;
	    
	    Animal(String name) {
	        this.name = name;
	    }
	    
	    void eat() {
	        System.out.println(name + " is eating.");
	    }
	    
	    void sleep() {
	        System.out.println(name + " is sleeping.");
	    }
	}

	// Subclass (Child Class)
	class Dog extends Animal {
	    Dog(String name) {
	        super(name); // Call the constructor of the superclass
	    }
	    
	    void bark() {
	        System.out.println(name + " is barking.");
	    }
	}

	class Cat extends Animal {
	    Cat(String name) {
	        super(name); // Call the constructor of the superclass
	    }
	    
	    void meow() {
	        System.out.println(name + " is meowing.");
	    }
	}

	


