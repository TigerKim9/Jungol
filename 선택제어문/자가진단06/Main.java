package 선택제어문.자가진단06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String gender;
		int age;
		gender = sc.next();
		age = sc.nextInt();

		if (gender.equals("M") && age >= 18) {
			System.out.println("MAN");
		} else if (gender.equals("M") && age < 18) {
			System.out.println("BOY");
		} else if (gender.equals("F") && age >= 18) {
			System.out.println("WOMAN");
		} else if (gender.equals("F") && age < 18) {
			System.out.println("GIRL");
		}

		// 이중 if문 쓰기
		if (gender.equals("M")) {
			if (age < 18) {
				System.out.println("BOY");
			} else {
				System.out.println("MAN");
			}
		} else if (gender.equals("F")) {
			if (age < 18) {
				System.out.println("GIRL");
			} else {
				System.out.println("WOMAN");
			}
		}

		sc.close();
	}// end main

}// end class
