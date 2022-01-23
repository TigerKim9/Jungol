package 반복제어문2.형성평가10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			//X 1 ~ X 9
			for(int mul = 1; mul <= 9; mul++) {
				
				for(int dan = a; dan >= b; dan--) {
					System.out.printf("%d * %d = %2d   ", dan, mul, dan * mul);
				}
				System.out.println();
				
			}
			
		}else {//
			//X 1 ~ X 9
			for(int mul = 1; mul <= 9; mul++) {
				
				for(int dan = a; dan <= b; dan++) {
					System.out.printf("%d * %d = %2d   ", dan, mul, dan * mul);
				}
				System.out.println();
				
			}
			
		}
		
		
		sc.close();
	}

}
