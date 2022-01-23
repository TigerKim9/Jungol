package 배열1.형성평가08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];


		int sum = 0;
		double avg = 0.;
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] == 0)	break;

			if(num[i] % 5 == 0) {
				sum += num[i];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		
		System.out.println("Multiples of 5 : " + cnt);
		System.out.println("sum : "+ sum);
		System.out.printf("avg : %.1f", avg);
		
		sc.close();
	}

}
