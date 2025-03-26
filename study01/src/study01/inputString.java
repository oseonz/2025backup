package study01;

import java.util.Scanner;

public class inputString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("당신의 이름은? ");
		name= sc.next();
		
		System.out.print("당신의 나이는? ");
		age= sc.nextInt();
		
		System.out.println(name+"님 안녕하세요! "+age+"살이시네요");
	}

}
