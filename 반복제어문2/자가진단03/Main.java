package 반복제어문2.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		
		while(i <= num) {
			if(i % 2 == 0) {
				System.out.print(i + " ");	
			}
			i++;
		}
	}

}
