package 연잔자.자가진단08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		int max = (a > b) ? a : b;
//		int maxx = (max > c) ? max : c;
		
	
		
		if(a > b && a > c) {
			System.out.print(1 + " ");
		}else {
			System.out.print(0 + " ");
		}
		if(a == b && b == c) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
		
		sc.close();
	}

}
