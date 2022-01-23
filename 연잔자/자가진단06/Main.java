package 연잔자.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int p1 = (n1 > n2) ? 1 : 0;
		int p2 = (n1 < n2) ? 1 : 0;
		int p3 = (n1 >= n2) ? 1 : 0;
		int p4 = (n1 <= n2) ? 1 : 0;
		
		System.out.println(n1 + " > " + n2 + " --- " + p1);
		System.out.println(n1 + " < " + n2 + " --- " + p2);
		System.out.println(n1 + " >= " + n2 + " --- " + p3);
		System.out.println(n1 + " <= " + n2 + " --- " + p4);
		
		sc.close();
	}

}
