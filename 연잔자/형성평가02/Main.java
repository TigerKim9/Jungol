package 연잔자.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int mok = n1 / n2;
		int nam = n1 % n2;

		System.out.println(n1 + " / " + n2 + " = " + mok + "..." + nam);

		sc.close();
	}

}
