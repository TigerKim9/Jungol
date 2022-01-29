package 함수1.자가진단07;

import java.util.Scanner;

public class Main {
	static int[] mulAndhalf(int a, int b) {
		if (a > b) {
			a = a / 2;
			b = b * 2;
			return new int [] {a,b};
		} else {
			a = a * 2;
			b = b / 2;
			return new int [] {a,b};
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int j = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=0; i < 2;i++) {
		System.out.print(mulAndhalf(j,k)[i] + " ");
		}
		sc.close();
		
	}

}
