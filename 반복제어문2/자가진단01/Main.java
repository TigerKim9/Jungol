package 반복제어문2.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = "";
		word = sc.next();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(word);
			
		}
		
		sc.close();
	}

}
