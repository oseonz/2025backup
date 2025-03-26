package study_interface;

public class AnimalkTest {

	public static void main(String[] args) {
		Animal myDog = new Dog("코코", 3, "말티즈");
		
		myDog.showInfo();
		myDog.makeSound();
		myDog.eat();
	}

}
