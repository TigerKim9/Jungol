package 반복제어문2.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cntOdd = 0; // 홀수의 개수
		int cntEven = 0; // 짝수의 개수

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if(num % 2 == 0)cntEven++;
			else cntOdd++;

		}
		System.out.println("even : " + cntEven);
		System.out.println("odd : " + cntOdd);
		sc.close();
	}

}
