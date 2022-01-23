package 입력.자가진단08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		char c = sc.next().charAt(0);
		
		System.out.printf("%.2f\n", a);
		System.out.printf("%.2f\n", b);
		System.out.printf("%c", c);
		sc.close();

	}

}
