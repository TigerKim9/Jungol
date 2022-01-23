package 연잔자.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		boolean c = (n1 != 0);
		boolean d = (n2 != 0);
		
		System.out.print((c && d) + " ");
		System.out.print(c || d);
		sc.close();
	}

}
