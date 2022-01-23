package 배열1.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] weight = new double[6];
		double sum = 0.;
		double avg = 0.;
		
		for (int i = 0; i < weight.length; i++) {
			weight[i] = sc.nextDouble();
			
			sum += weight[i];
		}
		avg = sum / weight.length;
		
		System.out.printf("%.1f",avg);
		
		
		sc.close();
	}
}
