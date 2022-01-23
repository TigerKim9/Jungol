package 선택제어문.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double a = 4.0;
		double b = 3.0;
		
		
		if(n1 >= a && n2 >= a) {
			System.out.println("A");
		}else if(n1 >= b && n2 >= b) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		sc.close();
	}

}
