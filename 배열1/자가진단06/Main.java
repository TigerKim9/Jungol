package 배열1.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		int n;

		for (int i = 0; i < arr.length; i++) {
			n = sc.nextInt();
			arr[i] = n;
			}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		
		System.out.println(min);
		sc.close();
	}
}
