package 함수1.형성평가03;

import java.util.Scanner;

public class Main {
	
	static void square(int a) {
		for (int i = 1; i <= a; i++) {
			for(int j = 1; j <= a;j++)
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		sc.close();
	}

}
