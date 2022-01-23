package 함수1.자가진단02;

import java.util.Scanner;

public class Main {
	
	static void radius(int n) {
		System.out.printf("%.2f",n * n * 3.14);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		radius(n);
		sc.close();
	}

}
