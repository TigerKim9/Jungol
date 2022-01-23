package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("number? ");
		int num = sc.nextInt();
		
		if(num == 0) break;
		
		if(num < 0){
			System.out.println("negative number");
		}else {
			System.out.println("positive integer");
		}
		
	}
		sc.close();
	}

}
