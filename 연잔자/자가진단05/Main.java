package 연잔자.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int p = (n1 == n2) ? 1 : 0;
		int p2 = (n1 != n2) ? 1 : 0;
		System.out.println(p + "\n" + p2);
		
		sc.close();

	}

}
