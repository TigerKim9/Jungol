package 선택제어문.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		
		double fly = 50.80;
		double light = 61.23;
		double middle = 72.57;
		double cruise = 88.45;
		double heavy = 88.45;
		
		
		if(weight <= fly) {
			System.out.println("Flyweight");
		}else if(weight <= light) {
			System.out.println("Lightweight");
		}else if(weight <= middle) {
			System.out.println("Middleweight");
		}else if(weight <= cruise) {
			System.out.println("Cruiserweight");
		}else if(weight > heavy) {
			System.out.println("Heavyweight");
		}
		sc.close();
	}

}
