package study02;

public class star {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=2;i<=5;i++) {
			System.out.println("<"+i+"단>");
			
			for(int j=1;j<=9;j++) {
				
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}

}
