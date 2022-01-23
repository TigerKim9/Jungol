package 반복제어문3.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		while(true) {
			int n = sc.nextInt();
			cnt++;
			if(n == 0) {
				break;
			}
			else if(cnt == 20) {
				sum += n;
				avg = sum / cnt;
				break;
			}
			sum += n;
			avg = sum / cnt;
			
		}
		System.out.println(sum + " " + avg);
		
	}

}
