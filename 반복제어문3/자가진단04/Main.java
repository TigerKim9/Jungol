package 반복제어문3.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		sc.close();
	}

}
