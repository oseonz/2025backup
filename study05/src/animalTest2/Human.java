package animalTest2;

public class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람은 책을 읽습니다.");
	}
}
