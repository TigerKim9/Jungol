package 반복제어문3.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mul;
		
		for(int i = 1; i <100; i++) {
			mul = i * n;
			if(mul <100) {
				System.out.print(mul + " ");
				if(mul % 10 == 0) break;
				continue;
			}
			if(mul > 100) break;
			}
		sc.close();
		}
	} 


