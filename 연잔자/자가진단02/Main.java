package 연잔자.자가진단02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a += 100;
		b %= 10;
		
		System.out.print(a + " " + b);
		
		sc.close();
	}

}
