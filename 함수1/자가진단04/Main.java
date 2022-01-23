package 함수1.자가진단04;

import java.util.Scanner;

public class Main {
	
	static void max(int j, int k, int l) {
		int maxx = (j > k) ? j : k;
		int max = (maxx > l) ? maxx : l;
		
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		
		max(j,k,l);
		
		sc.close();
		
	}

}
