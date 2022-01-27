package 함수1.자가진단06;

import java.util.Scanner;

public class Main {

	static void mul(int j, String s, int k) {
		if (s.equals("+")) {
			System.out.printf("%d + %d = %d", j, k, j + k);
			return;
		}else if(s.equals("-")) {
			System.out.printf("%d - %d = %d", j, k, j - k);
			return;
		}else if(s.equals("*")) {
			System.out.printf("%d * %d = %d", j, k, j * k);
			return;
		}else if(s.equals("/")) {
			System.out.printf("%d / %d = %d", j, k, j / k);			
			return;
		}else {
			System.out.printf("%d %s %d = %d", j,s, k, 0);
			return;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int j = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();

		mul(j,s, k);
		sc.close();
	}

}
