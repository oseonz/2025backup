package study03;

public class BoxTest {

	public static void main(String[] args) {
		Box myBox = new Box();
		
		myBox.width = 0;
		myBox.length = 0;
		myBox.height = 0;
		
		System.out.println("상자의 가로, 세로, 높이는 " + myBox.width + ", " + myBox.height + ", " + myBox.length + "입니다.");
		System.out.println("상자의 부피는 " + myBox.getVolume() + "입니다.");
	}

}
