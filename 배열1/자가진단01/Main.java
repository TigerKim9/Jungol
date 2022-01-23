package 배열1.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] arr = new char[10];
		int i;
		char a;
		for(i = 0; i < arr.length; i++) {
			a = sc.next().charAt(0);
			arr[i] += a;
			
			System.out.print(arr[i]);
		}
		sc.close();
		
	}

}
