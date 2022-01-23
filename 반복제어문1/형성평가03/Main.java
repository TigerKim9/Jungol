package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0;
		double avg = 0.0;
		int i = 0;
		
		while(true) {
			int num = sc.nextInt();
			if(num > 100)break;	
			i++;
			sum += num;
			avg = (double)sum / i ;
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		
	}

}
