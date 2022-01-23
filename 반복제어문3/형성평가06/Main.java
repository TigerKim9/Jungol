package 반복제어문3.형성평가06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.printf("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%d ", 1 + j);
			}
			System.out.printf("\n");
		}
	}
}