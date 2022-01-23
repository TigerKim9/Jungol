package 반복제어문1.형성평가02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cntOdd = 0;	//홀수의 개수
		int cntEven = 0; //짝수의 개수
		
		while(true) {	//무한루프
			int i = sc.nextInt();
			//종료조건
			if(i == 0) break;
			
			if(i % 2 == 0)cntEven++;
			else cntOdd++;
		}
		System.out.println("odd : " + cntOdd);
		System.out.println("even : " + cntEven);
		sc.close();
		
		
		
//		int odd = sc.nextInt();
//		
//		for(int i = 0;;i++) {
//			if(odd == 0) break;
//		}

	}

}
