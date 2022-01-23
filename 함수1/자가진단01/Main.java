package 함수1.자가진단01;

import java.util.Scanner;

public class Main {
	
	static void print(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		print(n);
		sc.close();
	}

}
