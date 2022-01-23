package 반복제어문1.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		double avg = 0.0;
		while(true) {
			i++;
			int num = sc.nextInt();
			sum += num;
			avg = (double)sum / i;
			if(num > 99) break;
		}
		System.out.println(sum);
		System.out.printf("%.1f",avg);
		sc.close();
	}
	

}
