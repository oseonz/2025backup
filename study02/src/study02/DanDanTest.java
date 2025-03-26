package study02;

import java.util.Scanner;

public class DanDanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단");
		
		while(true) {
			System.out.print("단수를 입력하세요: ");
			int dan = sc.nextInt();
			
			if (dan==0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			 System.out.println(dan + "단을 입력하셨습니다.");
			 
			 for(int i=2;i<10;i++) {
				 System.out.println(dan+"*"+i+"="+dan*i);
			 }
		}
	}

}
