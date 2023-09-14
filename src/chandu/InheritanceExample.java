package chandu;

public class InheritanceExample {
	
	    public static void main(String[] args) {
	        Dog dog = new Dog("Buddy");
	        Cat cat = new Cat("Whiskers");
	        
	        dog.eat();   // Inherited from Animal class
	        dog.sleep(); // Inherited from Animal class
	        dog.bark();  // Specific to Dog class
	        
	        cat.eat();   // Inherited from Animal class
	        cat.sleep(); // Inherited from Animal class
	        cat.meow();  // Specific to Cat class
	    }
	}

