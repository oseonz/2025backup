package dogTest;

public class Dog extends Animal {

	public Dog(String name, int age) { //<-매개변수
		super(name, age); //변수
	}
	
	public void makeSound() {
		System.out.println("멍멍! 멍멍!");
	}

}
