package 반복제어문3.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (2 * n) - 2 - (2 * i); j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}
