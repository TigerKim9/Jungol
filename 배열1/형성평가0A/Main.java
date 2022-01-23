package 배열1.형성평가0A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] score = new int[n];

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {

				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;

				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		sc.close();
	}
}
