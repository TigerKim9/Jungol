package 반복제어문3.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 위 삼각형
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++)
				System.out.print(" ");

			for (int j = 0; j < ((2 * (n - i)) - 1); j++)
				System.out.print("*");

			System.out.print('\n');
		}

		// 아래 삼각형
		for (int i = 1; i < n; i++) {
			for (int k = 0; k < (n - i - 1); k++)
				System.out.print(" ");

			for (int j = 0; j < ((2 * i) + 1); j++)
				System.out.print("*");

			System.out.print('\n');
		}

	}
}
