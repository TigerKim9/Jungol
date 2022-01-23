package 함수1.자가진단05;

import java.util.Scanner;

public class Main {
	
	static void mul(int j, int k) {
		System.out.println((int)Math.pow(j,k));
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		mul(j,k);
		sc.close();
	}

}
