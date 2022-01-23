package 반복제어문1.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		while (true) {
			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China");
			System.out.print("number? ");
			int num = sc.nextInt();
			if (num > 4) {
				System.out.println("\nnone");
				break;
			}
			if (num == 1) {
				System.out.println("\nSeoul\n");
			}
			if (num == 2) {
				System.out.println("\nWashington\n");
			}
			if (num == 3) {
				System.out.println("\nTokyo\n");
			}
			if (num == 4) {
				System.out.println("\nBeijing\n");
			}
		}
		sc.close();
	}

}
