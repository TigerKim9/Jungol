package 반복제어문2.자가진단05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mul3 = 0; //3의 배수의 개수
		int mul5 = 0; //5의 배수의 개수
		
		
//		//10번 입력
//		for(int i = 0; i < 10; i++) {
//			int num = sc.nextInt();
//			
//			if(num % 3 == 0) mul3++;// 조건이 맞으면 값을 ++시켜준다(여기서는 3의 배수의 개수를 담음)
//			if(num % 5 == 0) mul5++;
//		}
		
		//while문으로 표현해보기
		int i = 0;
		while(i < 10 ) {
			int num = sc.nextInt();
			
			if(num % 3 == 0) mul3++;
			if(num % 5 == 0) mul5++;
			i++;
		}
		
		
		System.out.println("Multiples of 3 : " + mul3);
		System.out.println("Multiples of 5 : " + mul5);
		
		
		sc.close();

	}

}
