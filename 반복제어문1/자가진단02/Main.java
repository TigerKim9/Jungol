package 반복제어문1.자가진단02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int i = sc.nextInt();
		
		int sum = 0;
		while(0 < i) {
			
			sum += i;
			i--;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
