package study03;

public class FunctionTest {
	
	public static int addNum(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		
		
		System.out.println(total);

	}

}
