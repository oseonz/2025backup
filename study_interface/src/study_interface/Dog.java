package study_interface;

public class Dog implements Animal {
	private String name;
	private int age;
	private String breed;
	
	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println();
	}
	
	@Override
	public void eat() {
		System.out.println(name+"가 사료를 먹습니다...");
	}

	@Override
	public void showInfo() {
		System.out.println("개 정보 - 이름: "+name+", 나이: "+age);
		System.out.println("다리: "+LEGS+"개, 꼬리: "+TAILS+"개");
	}
}
