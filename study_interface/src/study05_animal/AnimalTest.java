package study05_animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animal[0] = new Dog("바둑이", 3, "진돗개");
		animal[1] = new Cat("나비", 4, "검은색");
		
		for(Animal animal:animals) {
			System.out.println(animal);
			animal.eat();
			animal.makeSound();
			animal.sleep();
			
			System.out.println("-----------");
		}
		
		Dog myDog = (Dog)animaels[0];
	}

}
