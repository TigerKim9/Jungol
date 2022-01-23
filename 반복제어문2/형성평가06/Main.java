package 반복제어문2.형성평가06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int n1 = sc.nextInt();

		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
	
		
		if (n > n1) {

			for (int i = n1; i <= n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
					avg = (double)sum / cnt;
			
				}
			}
		}
		 else if (n < n1) {
			for (int i = n; i <= n1; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
					avg = (double)sum / cnt;
			
				}
			}
		
	}else if(n == n1) {
		sum += n;
		avg = (double)sum / 1;
		
	}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		sc.close();
	}
}


		
//		for (int i = n; i <= n1; i++) {
//			if(i % 3 == 0 || i % 5 == 0) {
//				sum += i;
//				cnt++;
//				avg = (double)sum / cnt;
//			}
//		}