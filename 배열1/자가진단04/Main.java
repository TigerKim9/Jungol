package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[100];
		int i;
		int a;
		
		for (i = 0; i < arr.length; i++) {
			a = sc.nextInt();
			if(a == 0) break;
			arr[i] += a;
			
		}
		for (int j = 1; j <= i; j++) {
			
			System.out.print(arr[i-j] + " ");
		}
		sc.close();
	}

}
