package 함수1.자가진단03;

import java.util.Scanner;

public class Main {

	public static void square(int input) {

		int count = 0;
		for (int j = 1; j <= input * input; j++) {
			if ((count != 0) && (count % input == 0)) {
				System.out.println();
			}
			count++;

			System.out.print(j + " ");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		square(n);
		sc.close();
	}

}
