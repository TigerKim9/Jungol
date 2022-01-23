package 반복제어문2.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < n; i++) {
			int subj = sc.nextInt();
			sum += subj;
			avg = (double) sum / n;
		}
		System.out.printf("%.2f", avg);
	}

}
