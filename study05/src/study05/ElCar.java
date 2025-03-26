package study05;

public class ElCar extends Car {
	int battery; //초기값 0
	public void charge(int amount) {
		battery += amount;
	}
}
