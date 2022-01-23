package 반복제어문3.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char a = 65;
		int i,j,k,l;
		int b = 1;

		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(b+" ");
				b++;

			}
			for (k = 0; k <= i; k++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
			

		}

		sc.close();
	}
}


