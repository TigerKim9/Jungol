package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char grade = sc.next().charAt(0);
		
		String a = "Excellent";
		String b = "Good";
		String c = "Usually";
		String d = "Effort";
		String f = "Failure";
		String e = "error";
		
		if(grade == 'A') {
			System.out.println(a);
		}else if (grade == 'B') {
			System.out.println(b);
		}else if(grade == 'C') {
			System.out.println(c);
		}else if(grade == 'D') {
			System.out.println(d);
		}else if(grade == 'F') {
			System.out.println(f);
		}else {
			System.out.println(e);
		}
		sc.close();
	}

}
