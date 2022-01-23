package 반복제어문2.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int n1 = sc.nextInt();

		if (n > n1) {

			for (int i = n1; i <= n; i++)
				System.out.print(i + " ");
		} else if (n < n1) {
			for (int i = n; i <= n1; i++) {
				System.out.print(i + " ");

			}

		} else {
			System.out.println(n);
		}
		sc.close();
	}
}
